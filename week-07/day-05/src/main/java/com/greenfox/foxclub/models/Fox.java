package com.greenfox.foxclub.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Fox {
  // name, list of tricks, food and drink
  private String name;
  private List<String> listOfTrick;
  private String food;
  private String drink;

  public Fox(String name){
    this.name = name;
    this.food = "pizza";
    this.drink = "lemonade";
    this.listOfTrick = new ArrayList<>();
  }
  public Fox(){
    this.food = "pizza";
    this.drink = "lemonade";
    this.listOfTrick = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getListOfTrick() {
    return listOfTrick;
  }

  public void setListOfTrick(List<String> listOfTrick) {
    this.listOfTrick = listOfTrick;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
