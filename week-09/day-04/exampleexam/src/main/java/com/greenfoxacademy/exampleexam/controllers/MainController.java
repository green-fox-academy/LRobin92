package com.greenfoxacademy.exampleexam.controllers;

import com.greenfoxacademy.exampleexam.models.Message;
import com.greenfoxacademy.exampleexam.services.LinkService;
import com.greenfoxacademy.exampleexam.services.LinkServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MainController {
  private LinkService service;

  public MainController(LinkServiceImp service){
    this.service = service;
  }

  @GetMapping("/")
  public String mainPage(Model model){
    model.addAttribute("messageInfo",service.getMessage());
    return "index";
  }
  @PostMapping("/save-link")
  public String saveLink(String urlInput, String aliasInput){
    service.addLink(urlInput, aliasInput);
    return "redirect:/";
  }

  @GetMapping("/a/{alias}")
  public String incrementAliasHitCounter(){
    return "index";
  }
}
