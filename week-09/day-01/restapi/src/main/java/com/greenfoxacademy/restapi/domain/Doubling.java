package com.greenfoxacademy.restapi.domain;

public class Doubling {
  Integer received;
  Integer result;

  public Doubling(Integer received) {
    this.received = received;
    this.result = received * 2;
  }

  public Integer getReceived() {
    return received;
  }

  public Integer getResult() {
    return result;
  }

}

