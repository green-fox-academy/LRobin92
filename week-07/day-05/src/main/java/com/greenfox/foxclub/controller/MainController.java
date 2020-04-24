package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.models.Fox;
import com.greenfox.foxclub.services.FoxService;
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
  private FoxService service;
  private List<Fox> listOfGreenFoxes = new ArrayList<>();


  @Autowired
  public MainController(Fox fox, FoxService service) {
    this.fox = fox;
    this.service = service;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String displayMainPage(Model model) {
    model.addAttribute("list", service.getFoxes().size());
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
  public String postLogin(@RequestParam(value = "nameInput") String nameInput) {
    if (service.getFoxes().stream().noneMatch(fox -> fox.getName().contains(nameInput))) {
      service.addFox(fox);
      this.fox.setName(nameInput);
      return "redirect:/?name=" + nameInput;
    } else if (service.getFoxes().stream().anyMatch(fox -> fox.getName().contains(nameInput))) {
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
  @RequestMapping(value = "/trickCenter", method = RequestMethod.GET)
  public String displayTricksCenter() {
    return "trickscenter";
  }
  @RequestMapping(value = "/trickCenter", method = RequestMethod.POST)
  public String learnTricks(int numberoftricks, Model model) {
    if (numberoftricks == 1){
      fox.getListOfTrick().add("Programming in Java");
    }else if(numberoftricks == 2){
      fox.getListOfTrick().add("Write in HTML");
    }else if (numberoftricks == 3){
      fox.getListOfTrick().add("Giving great presentation");
    } else{
      fox.getListOfTrick().add("Can speak english fluently");
    }
    return "redirect:/?name=" + fox.getName();
  }


}
