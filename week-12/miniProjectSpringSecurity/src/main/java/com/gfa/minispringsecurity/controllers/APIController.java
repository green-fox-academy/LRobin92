package com.gfa.minispringsecurity.controllers;

import com.gfa.minispringsecurity.models.AuthenticationRequest;
import com.gfa.minispringsecurity.models.AuthenticationResponse;
import com.gfa.minispringsecurity.models.User;
import com.gfa.minispringsecurity.services.MyUserDetailsServiceImp;
import com.gfa.minispringsecurity.services.PersonAPIService;
import com.gfa.minispringsecurity.services.UserService;
import com.gfa.minispringsecurity.util.JwtUtil;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
  @Autowired
  private PersonAPIService personAPIService;

  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private MyUserDetailsServiceImp userDetailsService;

  @Autowired
  private JwtUtil jwtTokenUtil;

  @Autowired
  private UserService userService;

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("api/person/{id}")
  public ResponseEntity<?> showPersonById(@PathVariable("id") int id) throws IOException {
    return ResponseEntity.ok().body(this.personAPIService.fetch(id));
  }

  @GetMapping("api/list")
  public ResponseEntity<?> showPeopleFromDB(){
    return ResponseEntity.ok().body(this.personAPIService.findAllPeople());
  }

  @PostMapping("/register")
  public ResponseEntity<?> saveUser(@RequestBody User user){
    return ResponseEntity.ok().body(this.userService.save(user));
  }

  @PostMapping("/auth")
  public ResponseEntity<?> createAuthToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
    try {
      authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
    } catch (BadCredentialsException e) {
      throw new Exception("Incorrect username or password", e);
    }
    final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

    final String jwt = jwtTokenUtil.generateToken(userDetails);

    return ResponseEntity.ok(new AuthenticationResponse(jwt));
  }
}
