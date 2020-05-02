package com.greenfoxacademy.connectwithmysql.controller;

import com.greenfoxacademy.connectwithmysql.model.Assignee;
import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import com.greenfoxacademy.connectwithmysql.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TodoController {
  private ToDoService service;
  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository, ToDoService service) {
    this.todoRepository = todoRepository;
    this.service = service;
  }

  @GetMapping(value = {"/todo"})
  public String mainPage(Model model) {
    model.addAttribute("todos", service.getAllTodo());
    return "todolist";
  }

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam boolean isActive, Model model) {
    model.addAttribute("todos", todoRepository.findAllByDoneEquals(!isActive));
    return "todolist";
  }

  @GetMapping(value = {"/todo/add"})
  public String getAddNewTodo() {
    return "addnewtodo";
  }

  @PostMapping(value = {"/todo/add"})
  public String postAddNewTodo(@RequestParam String addTodo) {
    service.saveToDo(new Todo(addTodo));
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable Long id) {
    Todo todelete = todoRepository.findById(id).get();
    todoRepository.delete(todelete);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String todoEdit(Model model, @PathVariable("id") long id) {
    Todo toedit = todoRepository.findById(id).get();
    model.addAttribute("todo", toedit);
    return "edittodo";
  }

  @PostMapping("/{id}/edit")
  public String todoEditSubmit(@PathVariable("id") long id, RedirectAttributes redirectAttributes,
                               @RequestParam(required = false) String done,
                               @RequestParam(required = false) String urgent,
                               @RequestParam String title) {
    redirectAttributes.addAttribute("isActive", "true");
    Todo toedit = todoRepository.findById(id).get();
    toedit.setTitle(title);
    if (done != null) {
      toedit.setDone(true);
    }
    if (urgent != null) {
      toedit.setUrgent(true);
    }
    todoRepository.save(toedit);
    return "redirect:/";
  }

  @PostMapping("/search")
  public String searchTodos(@RequestParam(value = "searchInPut") String searchWord,
                            @RequestParam(value = "searchType") String searchType,
                            Model model) {
    model.addAttribute("todos", service.searchTodosByWord(searchType, searchWord));
    return "todolist";
  }

  @GetMapping("/listassignees")
  public String listAssignees(Model model) {
    model.addAttribute("assignees", service.getAllAssignees());
    return "assigneelist";
  }

  @GetMapping("/addassignee")
  public String getCreateAssignee(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "assigneecreation";
  }

  @PostMapping("/addassignee")
  public String postCreateAssignee(@ModelAttribute Assignee assignee) {
    service.saveAssignee(assignee);
    return "redirect:/listassignees";
  }

  @GetMapping("{id}/deleteassignee")
  public String deleteAssignee(@PathVariable(value = "id") Long id) {
    service.deleteAssigneeById(id);
    return "redirect:/listassignees";
  }

  @GetMapping("{id}/editassignee")
  public String getEditAssignee(@PathVariable(value = "id") Long id,
                                Model model) {
    model.addAttribute("assignee", service.getAssigneeById(id));
    return "assigneeedit";
  }

  @PostMapping("{id}/editassignee")
  public String postEditAssignee(@ModelAttribute Assignee assignee,
                                 @PathVariable(value = "id") Long id) {
    service.saveAssignee(assignee);
    return "redirect:/listassignees";
  }

  @GetMapping("/assigneeinfo/{id}")
  public String getAssigneeInfo(@PathVariable(value = "id") Long id,
                                Model model) {
    model.addAttribute("assignee", service.getAssigneeById(id));
    model.addAttribute("assigneetodolist", service.getAssigneeById(id).getTodoList());
    return "assigneeinfo";
  }
}