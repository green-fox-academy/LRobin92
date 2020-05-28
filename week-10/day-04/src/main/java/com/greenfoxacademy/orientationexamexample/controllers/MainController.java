package com.greenfoxacademy.orientationexamexample.controllers;

import com.greenfoxacademy.orientationexamexample.models.Human;
import com.greenfoxacademy.orientationexamexample.services.HumanService;
import com.greenfoxacademy.orientationexamexample.services.HumanServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  private HumanService service;

  public MainController(HumanServiceImp service) {
    this.service = service;
  }

  @GetMapping("/list-humans")
  public String mainPage(Model model, @ModelAttribute Human human) {
    model.addAttribute("listOfHuman", service.getAllHumans());
    model.addAttribute("human", human);
    return "index";
  }

  @PostMapping("/add-human")
  public String addHuman(@ModelAttribute Human human) {
    service.AddHuman(human);
    return null;
  }
}
