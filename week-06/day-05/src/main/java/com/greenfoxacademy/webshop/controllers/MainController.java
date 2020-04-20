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

  public List<ShopItem> addItemsToList() {
    emptyList.add(new ShopItem("Running shoes",
        "Nike running shoes for everyday sport", 1000, 5, "clothesandshoes"));
    emptyList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce",
        119, 100, "beveragesandsnacks"));
    emptyList.add(new ShopItem("Printer", "Some HP printer that will print pages",
        3000, 2, "electronics"));
    emptyList.add(new ShopItem("Coca cola", "0.5l standard coke",
        25, 0, "beveragesandsnacks"));
    emptyList.add(new ShopItem("T-shirt", "Blue with a corgi on a bike",
        300, 1, "clothesandshoes"));
    return emptyList;
  }

  @ResponseBody
  @RequestMapping(value = "", method = RequestMethod.GET)
  public String helloWorld() {
    return "Hello World";
  }

  @RequestMapping(value = "/webshop", method = RequestMethod.GET) //
  public String displayMyShop(Model model) {
    model.addAttribute("items", shopItemsList);
    model.addAttribute("currency", "czk");
    return "myshop";
  }

  @RequestMapping(value = "webshop/onlyavaible", method = RequestMethod.GET)
  public String onlyAvaible(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .collect(Collectors.toList()));
    model.addAttribute("currency", "czk");
    return "myshop";
  }

  @RequestMapping(value = "webshop/cheapest", method = RequestMethod.GET)
  public String cheapestFirst(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toList()));
    model.addAttribute("currency", "czk");
    return "myshop";
  }

  @RequestMapping(value = "webshop/containsnike", method = RequestMethod.GET)
  public String containsNike(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .filter(item -> item.getName().toLowerCase().contains("nike")
            || item.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList()));
    model.addAttribute("currency", "czk");
    return "myshop";
  }

  @RequestMapping(value = "webshop/mostexpensive", method = RequestMethod.GET)
  public String mostExpensiveItem(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice).reversed())
        .limit(1)
        .collect(Collectors.toList()));
    model.addAttribute("currency", "czk");
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
    model.addAttribute("currency", "czk");
    return "myshop";
  }

  @RequestMapping(value = "/webshop/more", method = RequestMethod.GET) //
  public String moreOption(Model model) {
    model.addAttribute("items", shopItemsList);
    model.addAttribute("currency", "czk");
    return "morefilteroption";
  }

  @RequestMapping(value = "webshop/clothesandshoes", method = RequestMethod.GET)
  public String clothesAndShoes(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .filter(item -> item.getType().equals("clothesandshoes"))
        .collect(Collectors.toList()));
    model.addAttribute("currency", "czk");
    return "morefilteroption";
  }

  @RequestMapping(value = "webshop/electronics", method = RequestMethod.GET)
  public String electronics(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .filter(item -> item.getType().equals("electronics"))
        .collect(Collectors.toList()));
    model.addAttribute("currency", "czk");
    return "morefilteroption";
  }

  @RequestMapping(value = "webshop/beveragesandsnacks", method = RequestMethod.GET)
  public String beveragesAndSnacks(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .filter(item -> item.getType().equals("beveragesandsnacks"))
        .collect(Collectors.toList()));
    model.addAttribute("currency", "czk");
    return "morefilteroption";
  }

  @RequestMapping(value = "webshop/originalprice", method = RequestMethod.GET)
  public String originalCurrency(Model model) {
    model.addAttribute("items", shopItemsList);
    model.addAttribute("currency", "czk");
    return "morefilteroption";
  }

  @RequestMapping(value = "webshop/priceineuro", method = RequestMethod.GET)
  public String priceInEuro(Model model) {
    model.addAttribute("items", shopItemsList.stream()
        .map(item -> new ShopItem(item.getName(), item.getDescription(),
            item.getPrice() * 0.035f,
            item.getQuantityOfStock(), item.getType()))
        .collect(Collectors.toList()));
    model.addAttribute("currency", "eur");
    return "morefilteroption";
  }

  @RequestMapping(path = "/webshop/filterbyprice", method = RequestMethod.POST)
  public String filterByPrice(@RequestParam String searchValue,
                              @RequestParam(value = "filterbyprice") Integer number,
                              Model model) {
    switch (searchValue) {
      case "Above":
        model.addAttribute("items", shopItemsList.stream()
            .filter(item -> item.getPrice() > Float.valueOf(number))
            .collect(Collectors.toList()));
        break;
      case "Below":
        model.addAttribute("items", shopItemsList.stream()
            .filter(item -> item.getPrice() < Float.valueOf(number))
            .collect(Collectors.toList()));
        break;
      case "Exactly":
        model.addAttribute("items", shopItemsList.stream()
            .filter(item -> item.getPrice() == Float.valueOf(number))
            .collect(Collectors.toList()));
        break;
    }
    model.addAttribute("currency", new String("CZK"));
    return "morefilteroption";
  }


}
