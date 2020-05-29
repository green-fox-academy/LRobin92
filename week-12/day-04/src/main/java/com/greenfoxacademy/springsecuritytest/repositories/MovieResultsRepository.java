package com.greenfoxacademy.springsecuritytest.repositories;

import com.greenfoxacademy.springsecuritytest.dtos.MovieDTO;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MovieResultsRepository extends CrudRepository<MovieDTO , Integer> {
  List<MovieDTO> findAll();
}
