package com.greenfoxacademy.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private long id;
  private int voteScore;
  private String title;
  private String url;

  public Post() {
    this.voteScore = 1;
  }
  public Post(String title) {
    this.title = title;
    this.voteScore = 1;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getVoteScore() {
    return voteScore;
  }

  public void setVoteScore(int voteScore) {
    this.voteScore = voteScore;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  public void increaseScore(){
    this.voteScore++;
  }
  public void reduceScore(){
    if (this.voteScore > 0){
      this.voteScore--;
    }

  }

}
