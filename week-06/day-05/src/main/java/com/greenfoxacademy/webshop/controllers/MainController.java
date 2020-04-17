package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.ShopItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

  @RequestMapping(value="/webshop", method = RequestMethod.GET) //
  public String displayMyShop(Model model){
    model.addAttribute("items", shopItemsList);
    return "myshop";
  }
  private List<ShopItem> emptyList = new ArrayList<>();
  private List<ShopItem> shopItemsList = addItemsToList();

  public List<ShopItem> addItemsToList(){
    emptyList.add(new ShopItem("Running shoes",
        "Nike running shoes for everyday sport", 1000 ,5));
    emptyList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce",
        119 ,100));
    emptyList.add(new ShopItem("Printer", "Some HP printer that will print pages",
        3000,2));
    emptyList.add(new ShopItem("Coca cola", "0.5l standard coke",
        25,0));
    emptyList.add(new ShopItem("T-shirt", "Blue with a corgi on a bike",
        300,1));
    return emptyList;
  }



}
