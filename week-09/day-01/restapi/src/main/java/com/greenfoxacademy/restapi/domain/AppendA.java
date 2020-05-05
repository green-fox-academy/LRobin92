package com.greenfoxacademy.restapi.domain;

public class AppendA {

  private String appended;

  public AppendA(String appendableWord) {
    this.appended = appendableWord + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
