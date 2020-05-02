package com.greenfoxacademy.connectwithmysql.repository;

import com.greenfoxacademy.connectwithmysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
  void deleteById(Long id);
  Assignee getAssigneeById(Long id);
}