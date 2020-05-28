package com.greenfoxacademy.orientationexamexample.repositories;

import com.greenfoxacademy.orientationexamexample.models.Human;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends CrudRepository<Human, Long> {
  List<Human> findAll();
}
