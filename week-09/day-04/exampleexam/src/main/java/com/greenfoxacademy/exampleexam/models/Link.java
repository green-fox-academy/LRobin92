package com.greenfoxacademy.exampleexam.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(value = {"secretCode"})
public class Link {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long id;
  private String url;
  private String alias;
  private int hitCount;
  private String secretCode;
  private boolean isDone;

  public Link(String url, String alias, String secretCode) {
    this.url = url;
    this.alias = alias;
    this.secretCode = secretCode;
  }

  public Link() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  public String getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(String secretCode) {
    this.secretCode = secretCode;
  }

  public int getHitCount() {
    return hitCount;
  }

  public void setHitCount(int hitCount) {
    this.hitCount = hitCount;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }
}
