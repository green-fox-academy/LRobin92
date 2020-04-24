package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.models.Fox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private Fox fox;
  private List<Fox> listOfGreenFoxes = new ArrayList<>();

  @Autowired
  public MainController(Fox fox) {
    this.fox = fox;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String displayMainPage(Model model) {
    model.addAttribute("foxinformation", "This is " + fox.getName()
        + ". Currently living on " + fox.getFood() + " and " + fox.getDrink() +
        ". He knows " + fox.getListOfTrick().size() + " tricks.");
    if (fox.getListOfTrick().isEmpty()) {
      model.addAttribute("tricks", "You know no tricks yet. " +
          "Go and learn some");
    } else {
      model.addAttribute("tricks", fox.getListOfTrick());
    }
    return "index";
  }

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String displayLoginPage() {
    return "login";
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String postLogin(@RequestParam(value = "nameInput") String nameInput, Model model) {
    if (listOfGreenFoxes.stream().noneMatch(fox -> fox.getName().contains(nameInput))) {
      fox.setName(nameInput);
      listOfGreenFoxes.add(fox);
      return "redirect:/?name=" + nameInput;
    } else if (listOfGreenFoxes.stream().anyMatch(fox -> fox.getName().contains(nameInput))) {
      return "redirect:/?name=" + nameInput;
    } else {
      return null;
    }
  }

  @RequestMapping(value = "/information", method = RequestMethod.GET)
  public String displayInformationPage() {
    return "login";
  }

  @RequestMapping(value = "/nutritionStore", method = RequestMethod.GET)
  public String displayNutriStore() {
    return "nutristore";
  }


}
