package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.models.Fox;
import com.greenfox.foxclub.services.FoxService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private FoxService service;


  @Autowired
  public MainController(FoxService service) {
    this.service = service;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String displayMainPage(Model model) {
    model.addAttribute("foxinformation", "This is " + service.getCurrentFox().getName()
        + ". Currently living on " + service.getCurrentFox().getFood() + " and " + service.getCurrentFox().getDrink() +
        ". He knows " + service.getCurrentFox().getListOfTrick().size() + " tricks.");
    if (service.getCurrentFox().getListOfTrick().isEmpty()) {
      model.addAttribute("tricks", "You know no tricks yet. " +
          "Go and learn some");
    } else {
      model.addAttribute("tricks", service.getCurrentFox().getListOfTrick());
    }
    model.addAttribute("list", service.getFoxes().size());
    return "index";
  }

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String displayLoginPage() {
    return "login";
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String postLogin(@RequestParam(value = "nameInput") String nameInput) {
    if (service.getFoxes().stream().noneMatch(fox -> fox.getName().contains(nameInput))) {
      service.addFox(new Fox(nameInput));
    } else{
      service.setCurrentFox(nameInput);
    }
    return "redirect:/?name=" + service.getCurrentFox().getName();
  }

  @RequestMapping(value = "/information", method = RequestMethod.GET)
  public String displayInformationPage() {
    return "index";
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
  public String learnTricks(int numberoftricks) {
    if (numberoftricks == 1 && !service.getCurrentFox().getListOfTrick().contains("Programming in Java")) {
      service.getCurrentFox().getListOfTrick().add("Programming in Java");
    } else if (numberoftricks == 2 && !service.getCurrentFox().getListOfTrick().contains("Write in HTML")) {
      service.getCurrentFox().getListOfTrick().add("Write in HTML");
    } else if (numberoftricks == 3 && !service.getCurrentFox().getListOfTrick().contains("Giving great presentation")) {
      service.getCurrentFox().getListOfTrick().add("Giving great presentation");
    } else if (numberoftricks == 4 && !service.getCurrentFox().getListOfTrick().contains("Can speak english fluently")){
      service.getCurrentFox().getListOfTrick().add("Can speak english fluently");
    }
    return "redirect:/?name=" + service.getCurrentFox().getName();
  }
  @RequestMapping(value = "/nutritionStore", method = RequestMethod.POST)
  public String ChangeNutriStore(int numberoffoods, int numberofdrinks) {
    if (numberoffoods == 1 && !service.getCurrentFox().getFood().equals("Pizza")) {
      service.getCurrentFox().setFood("Pizza");
    } else if (numberoffoods == 2 && !service.getCurrentFox().getFood().equals("Hamburger")) {
      service.getCurrentFox().setFood("Hamburger");
    } else if (numberoffoods == 3 && !service.getCurrentFox().getFood().equals("Salad")) {
      service.getCurrentFox().setFood("Salad");
    } else if (numberoffoods == 4 && !service.getCurrentFox().getFood().equals("Spagetthi")){
      service.getCurrentFox().setFood("Spagetthi");
    }
    if (numberofdrinks == 5 && !service.getCurrentFox().getFood().equals("Lemonade")) {
      service.getCurrentFox().setDrink("Lemonade");
    } else if (numberofdrinks == 6 && !service.getCurrentFox().getFood().equals("Coke")) {
      service.getCurrentFox().setDrink("Coke");
    } else if (numberofdrinks == 7 && !service.getCurrentFox().getFood().equals("Beer")) {
      service.getCurrentFox().setDrink("Beer");
    } else if (numberofdrinks == 8 && !service.getCurrentFox().getFood().equals("Juice")){
      service.getCurrentFox().setDrink("Juice");
    }
    return "redirect:/?name=" + service.getCurrentFox().getName();
  }


}
