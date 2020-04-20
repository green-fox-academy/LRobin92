package com.greenfoxacademy.webshop;

public class ShopItem {
  private String name;
  private String description;
  private float price;
  private int quantityOfStock;
  private String type;

  public ShopItem(String name, String description, float price, int quantityOfStock, String type) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public float getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public String getType() {
    return type;
  }
}
