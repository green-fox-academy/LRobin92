package com.gfa.minispringsecurity.repositories;

import com.gfa.minispringsecurity.DTO.PersonDTO;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends CrudRepository<PersonDTO, Long> {
  List<PersonDTO> findAllBy();
}
