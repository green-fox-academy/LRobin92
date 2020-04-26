package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService extends Fox {
  private List<Fox> foxes;
  private Fox currentFox;

  public FoxService() {
    foxes = new ArrayList<>();
  }
  public void setCurrentFox(String name) {
    for (Fox searchFox : foxes) {
      if (searchFox.getName().equals(name)) {
        this.currentFox = searchFox;
      }
    }
  }
  public List<Fox> getFoxes() {
    return foxes;
  }

  public void addFox(Fox fox) {
    foxes.add(fox);
    this.currentFox = fox;
  }

  public Fox getCurrentFox() {
    return currentFox;
  }

  public void setCurrentFox(Fox currentFox) {
    this.currentFox = currentFox;
  }
}
