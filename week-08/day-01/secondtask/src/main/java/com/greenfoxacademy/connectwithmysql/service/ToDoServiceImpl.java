package com.greenfoxacademy.connectwithmysql.service;

import com.greenfoxacademy.connectwithmysql.model.Assignee;
import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.AssigneeRepository;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
  public class ToDoServiceImpl implements ToDoService {
  private TodoRepository repo;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public ToDoServiceImpl(TodoRepository repo, AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
    this.repo = repo;
  }

  public Iterable<Todo> getAllTodo(){
    return repo.findAll();
  }
  public void saveToDo(Todo todo){
    repo.save(todo);
  }
  public Iterable<Todo> searchTodosByWord(String searchType, String searchWord) {
    switch (searchType) {
      case "title":
        return repo.getTodosByTitle(searchWord);
      case "content":
        return repo.getTodosByContent(searchWord);
      case "description":
        return repo.getTodosByDescription(searchWord);
      case "dueDate":
        return repo.getTodosByDueDate(searchWord);
      case "assignee":
        return repo.findAllByAssigneeName(searchWord);
    }
    return repo.findAll();
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
    repo.save(todo);
  }

}
