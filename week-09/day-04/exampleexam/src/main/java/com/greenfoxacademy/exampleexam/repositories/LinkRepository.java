package com.greenfoxacademy.exampleexam.repositories;

import com.greenfoxacademy.exampleexam.models.Link;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface LinkRepository extends CrudRepository <Link, Long> {
  List<Link> findAllBy();
}
