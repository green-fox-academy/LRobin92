package com.greenfoxacademy.connectwithmysql.service;

import com.greenfoxacademy.connectwithmysql.model.Assignee;
import com.greenfoxacademy.connectwithmysql.model.Todo;

public interface ToDoService {
  Iterable<Todo> getAllTodo();
  void saveToDo(Todo todo);
  Iterable<Todo> searchTodosByWord(String searchType, String searchWord);
  Iterable<Assignee> getAllAssignees();
  void saveAssignee(Assignee assignee);
  void deleteAssigneeById(Long id);
  Assignee getAssigneeById(Long id);
  void addAssigneeToTodo(Assignee assignee, Todo todo);
}
