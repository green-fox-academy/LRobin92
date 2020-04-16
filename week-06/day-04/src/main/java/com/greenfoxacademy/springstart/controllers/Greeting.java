package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  private long greetCount;
  private String content;

  public Greeting(long greetCount, String content){
    this.greetCount = greetCount;
    this.content = content;
  }
  public long getGreetCount() {
    return greetCount;
  }

  public void setGreetCount(long greetCount) {
    this.greetCount = greetCount;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


}
