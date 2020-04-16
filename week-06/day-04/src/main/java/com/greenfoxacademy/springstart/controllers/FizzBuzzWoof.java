package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FizzBuzzWoof {
  private AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/counter/count", method = RequestMethod.GET)
  public String greeting(Model model) {
    String result = "";
    Integer number = (int)counter.incrementAndGet();
    int fontSize = 12;

    if (number % 7 == 0 && number % 5 == 0 && number % 3 == 0) {
      result = "FizzBuzzWoof";
      fontSize = 72;
    } else if (number % 7 == 0 && number % 5 == 0) {
      result = "BuzzWoof";
      fontSize = 48;
    } else if (number % 7 == 0 && number % 3 == 0) {
      result = "FizzWoof";
      fontSize = 48;
    } else if (number % 5 == 0 && number % 3 == 0) {
      result = "FizzBuzz";
      fontSize = 48;
    } else if (number % 3 == 0) {
      result = "Fizz";
      fontSize = 24;
    } else if (number % 5 == 0) {
      result = "Buzz";
      fontSize = 24;
    } else if (number % 7 == 0) {
      result = "Woof";
      fontSize = 24;
    } else {
      result = number.toString();
    }
    model.addAttribute("number",result);
    model.addAttribute("fontSize", "font-size:"+fontSize +"px");
    return "counter";
  }
}
