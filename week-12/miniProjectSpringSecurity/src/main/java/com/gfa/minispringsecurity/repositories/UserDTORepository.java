package com.gfa.minispringsecurity.repositories;

import com.gfa.minispringsecurity.DTO.UserDTO;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDTORepository extends CrudRepository<UserDTO, Long> {

  UserDTO findByUsername(String username);
  List<UserDTO> findAllBy();
}
