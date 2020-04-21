package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  @GetMapping("/show")
  public String showDetails(Model model) {
    BankAccount account = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("simba", account);
    return "index";
  }

  @GetMapping("/htmlception")
  public String displayText(Model model) {
    String stringToDisplay = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", stringToDisplay);
    return "htmlception";
  }

  @GetMapping("/accounts")
  public String showAccounts(Model model) {
    List<BankAccount> listOfAccounts = new ArrayList<>();
    listOfAccounts.add(new BankAccount("Simba", 2000, "lion"));
    listOfAccounts.add(new BankAccount("Zazu", 500, "bird"));
    listOfAccounts.add(new BankAccount("Timon", 400, "meerkat"));
    listOfAccounts.add(new BankAccount("Pumbaa", 200, "warthog"));
    listOfAccounts.add(new BankAccount("Scar", 800, "lion"));
    model.addAttribute("accounts", listOfAccounts);
    return "listofaccounts";
  }


}
