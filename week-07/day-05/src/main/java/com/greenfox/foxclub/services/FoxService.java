package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  private List<Fox> foxes;

  public FoxService(){
    foxes = new ArrayList<>();
  }

  public List<Fox> getFoxes(){
    return foxes;
  }

  public void addFox(Fox fox){
    foxes.add(fox);
  }
}
