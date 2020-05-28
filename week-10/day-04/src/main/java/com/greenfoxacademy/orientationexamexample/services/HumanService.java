package com.greenfoxacademy.orientationexamexample.services;

import com.greenfoxacademy.orientationexamexample.models.Human;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface HumanService {
  void AddHuman(Human human);
  List<Human> getAllHumans();
}
