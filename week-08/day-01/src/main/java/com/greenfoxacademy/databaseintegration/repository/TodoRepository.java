package com.greenfoxacademy.databaseintegration.repository;

import com.greenfoxacademy.databaseintegration.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}