package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWebController {
  AtomicLong counter = new AtomicLong();

  @RequestMapping("/web/greeting/asd")
  public String greeting(Model model) {
    model.addAttribute("name", " World");
    model.addAttribute("counter", counter.getAndIncrement());
    return "greeting";
  }
}
