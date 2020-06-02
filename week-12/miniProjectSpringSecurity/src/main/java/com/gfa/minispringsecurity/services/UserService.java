package com.gfa.minispringsecurity.services;

import com.gfa.minispringsecurity.DTO.UserDTO;
import com.gfa.minispringsecurity.models.User;
import com.gfa.minispringsecurity.repositories.UserDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private PasswordEncoder bCryptPasswordEncoder;

  @Autowired
  private UserDTORepository userDTORepository;


  public UserDTO save(User user) {
    UserDTO newUser = new UserDTO();
    newUser.setUsername(user.getUsername());
    newUser.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    return this.userDTORepository.save(newUser);
  }
}
