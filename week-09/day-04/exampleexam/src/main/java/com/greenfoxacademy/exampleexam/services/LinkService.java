package com.greenfoxacademy.exampleexam.services;

import com.greenfoxacademy.exampleexam.models.Link;
import com.greenfoxacademy.exampleexam.models.Message;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface LinkService {
  void addLink(String url, String alias);
  void setMessage(boolean didItWork, String alias, String secretCode);
  Message getMessage();
  String incrementHitCount(String alias);
  List<Link> getAllLinks();
  void deleteLinkIfPossible(Long id, String secretCode);
  boolean checkIfExist(Long id);
  boolean checkCodeIsExist(String secretCode, Long id);
}
