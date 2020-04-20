package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
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

  @ResponseBody
  @RequestMapping(value = "", method = RequestMethod.GET)
  public String helloWorld() {
    return "Hello World";
  }
  @RequestMapping(value="/webshop", method = RequestMethod.GET) //
  public String displayMyShop(Model model){
    model.addAttribute("items", shopItemsList);
    return "myshop";
  }
  @RequestMapping(value = "webshop/onlyavaible", method = RequestMethod.GET)
  public String onlyAvaible(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .collect(Collectors.toList()));
    return "myshop";
  }
  @RequestMapping(value = "webshop/cheapest", method = RequestMethod.GET)
  public String cheapestFirst(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toList()));
    return "myshop";
  }
  @RequestMapping(value = "webshop/containsnike", method = RequestMethod.GET)
  public String containsNike(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .filter(item -> item.getName().toLowerCase().contains("nike")
            || item.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList()));
    return "myshop";
  }
  @RequestMapping(value = "webshop/mostexpensive", method = RequestMethod.GET)
  public String mostExpensiveItem(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice).reversed())
        .limit(1)
        .collect(Collectors.toList()));
    return "myshop";
  }
  @RequestMapping(value = "webshop/avarage", method = RequestMethod.GET)
  public String getAverageStock(Model model) {
    model.addAttribute("averageOfStock", shopItemsList.stream()
        .mapToDouble(item -> item.getQuantityOfStock())
        .average()
        .orElseGet(() -> 0));
    return "stockavarage";
  }
  @RequestMapping(path = "webshop/search", method = RequestMethod.POST)
  public String searchByNames(String searchInput,
                              Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .filter(item -> item.getName().toLowerCase().contains(searchInput.toLowerCase())
            || item.getDescription().toLowerCase().contains(searchInput.toLowerCase()))
        .collect(Collectors.toList()));
    return "myshop";
  }




}
