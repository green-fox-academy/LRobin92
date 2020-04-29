package com.greenfoxacademy.connectwithmysql.controller;

import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
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

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
  @GetMapping(value = {"/todo"})
  public String mainPage(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam boolean isActive , Model model) {
    model.addAttribute("todos", todoRepository.findAllByDoneEquals(!isActive));
    return "todolist";
  }
  @GetMapping(value = {"/todo/add"})
  public String getAddNewTodo() {

    return "addnewtodo";
  }
  @PostMapping(value = {"/todo/add"})
  public String postAddNewTodo(@RequestParam String addTodo) {
    todoRepository.save(new Todo(addTodo));
    return "redirect:/todo/";
  }
  @GetMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable Long id) {
    Todo todelete = todoRepository.findById(id).get();
    todoRepository.delete(todelete);
    return "redirect:/";
  }
  @GetMapping("/{id}/edit")
  public String todoEdit(Model model, @PathVariable("id") long id){
    Todo toedit = todoRepository.findById(id).get();
    model.addAttribute("todo", toedit);
    return "edittodo";
  }

  @PostMapping("/{id}/edit")
  public String todoEditSubmit(@PathVariable("id") long id, RedirectAttributes redirectAttributes,
                               @RequestParam(required = false) String done,
                               @RequestParam(required = false) String urgent,
                               @RequestParam String title){
    redirectAttributes.addAttribute("isActive", "true");
    Todo toedit = todoRepository.findById(id).get();
    toedit.setTitle(title);
    if (done != null){
      toedit.setDone(true);
    }
    if (urgent != null){
      toedit.setUrgent(true);
    }
    todoRepository.save(toedit);
    return "redirect:/";
  }
}