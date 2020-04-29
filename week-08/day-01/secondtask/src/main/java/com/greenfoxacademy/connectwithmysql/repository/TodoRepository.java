package com.greenfoxacademy.connectwithmysql.repository;

import com.greenfoxacademy.connectwithmysql.model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDoneEquals(boolean isDone);
}