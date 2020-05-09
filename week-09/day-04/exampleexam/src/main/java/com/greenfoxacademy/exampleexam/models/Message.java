package com.greenfoxacademy.exampleexam.models;

public class Message {
  private String message;
  private boolean isAvaible;

  public Message(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public boolean isAvaible() {
    return isAvaible;
  }

  public void setAvaible(boolean avaible) {
    isAvaible = avaible;
  }
}
