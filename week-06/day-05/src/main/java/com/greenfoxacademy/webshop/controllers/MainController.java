package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.ShopItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
  private List<ShopItem> listOfItems = new ArrayList<ShopItem>();
  

  @RequestMapping(value="/myshop", method = RequestMethod.GET) //
  public String greeting(){
    return "myshop";
  }
}
