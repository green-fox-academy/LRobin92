package com.gfa.minispringsecurity.services;

import com.gfa.minispringsecurity.DTO.UserDTO;
import com.gfa.minispringsecurity.repositories.UserDTORepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsServiceImp implements UserDetailsService {

  @Autowired
  private UserDTORepository userDTORepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UserDTO user = this.userDTORepository.findByUsername(username);
    if(user==null){
      throw new UsernameNotFoundException("User not found with username: " + username);
    }
    return new User(user.getUsername(), user.getPassword(),
        new ArrayList<>());
  }
}
