package com.greenfoxacademy.restapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(value = {"until"})
public class DoUntil {
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private Integer until;
  private Integer result;

  public DoUntil(Integer until) {
    this.until = until;
  }
  public DoUntil() {
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }
  public void setSumAction() {
    this.result = 0;
    for (int i = 1; i <= this.until; i++) {
      this.result += i;
    }
  }

  public void setFactorialAction() {
    this.result = 1;
    for (int i = 1; i <= this.until; i++) {
      this.result *= i;
    }
  }
}
