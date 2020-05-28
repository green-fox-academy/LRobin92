package com.greenfoxacademy.orientationexamexample.services;

import com.greenfoxacademy.orientationexamexample.models.Human;
import com.greenfoxacademy.orientationexamexample.repositories.HumanRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HumanServiceImp implements HumanService {
  private HumanRepository repo;

  public HumanServiceImp(HumanRepository repo) {
    this.repo = repo;
  }

  @Override
  public void AddHuman(Human human) {
    repo.save(human);
  }

  @Override
  public List<Human> getAllHumans() {
    return repo.findAll();
  }
}
