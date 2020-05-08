package com.greenfoxacademy.connectwithmysql.service;

import com.greenfoxacademy.connectwithmysql.model.Assignee;
import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.AssigneeRepository;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private TodoRepository todoRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public Iterable<Todo> getTodosByDoneIsFalse() {
    return todoRepository.getTodosByDoneIsFalse();
  }

  public Iterable<Todo> getAllTodos() {
    return todoRepository.findAll();
  }

  public void saveTodo(Todo todo) {
    todoRepository.save(todo);
  }

  public void deleteTodoById(Long id) {
    todoRepository.deleteById(id);
  }

  public Todo getTodoById(Long id) {
    return todoRepository.getTodoById(id);
  }

  public Iterable<Todo> searchTodosByWord(String searchType, String searchWord) {
    switch (searchType) {
      case "title":
        return todoRepository.getTodosByTitleContains(searchWord);
      case "content":
        return todoRepository.getTodosByContentContains(searchWord);
      case "description":
        return todoRepository.getTodosByDescriptionContains(searchWord);
      case "dueDate":
        return todoRepository.getTodosByDueDateContains(searchWord);
      case "assignee":
        return todoRepository.findAllByAssigneeNameContains(searchWord);
    }
    return todoRepository.findAll();
  }

  public Iterable<Assignee> getAllAssignees() {
    return assigneeRepository.findAll();
  }

  public void saveAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  public void deleteAssigneeById(Long id) {
    assigneeRepository.deleteById(id);
  }

  public Assignee getAssigneeById(Long id) {
    return assigneeRepository.getAssigneeById(id);
  }

  public void addAssigneeToTodo(Assignee assignee, Todo todo) {
    todo.setAssignee(assignee);
    List<Todo> todoList = assignee.getTodoList();
    todoList.add(todo);
    assignee.setTodoList(todoList);
    assigneeRepository.save(assignee);
    todoRepository.save(todo);
  }
}
