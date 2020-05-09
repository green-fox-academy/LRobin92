package com.greenfoxacademy.exampleexam.services;

import com.greenfoxacademy.exampleexam.models.Message;
import org.springframework.stereotype.Service;

@Service
public interface LinkService {
  void addLink(String url, String alias);
  void setMessage(boolean didItWork, String alias, String secretCode);
  Message getMessage();
}
