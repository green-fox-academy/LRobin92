package com.greenfoxacademy.exampleexam.services;

import com.greenfoxacademy.exampleexam.models.Link;
import com.greenfoxacademy.exampleexam.models.Message;
import com.greenfoxacademy.exampleexam.repositories.LinkRepository;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImp implements LinkService {
  private LinkRepository repo;
  private Message message;

  public LinkServiceImp(LinkRepository repo) {
    this.repo = repo;
  }

  @Override
  public void addLink(String url, String alias) {
    Random random = new Random();
    String secretCode = String.format("%04d", random.nextInt(10000));
    ;
    if (repo.findAllBy().stream().anyMatch(link -> link.getAlias().equals(alias))) {
      setMessage(false, alias, secretCode);
    } else {
      repo.save(new Link(url, alias, secretCode));
      setMessage(true, alias, secretCode);
    }
  }

  @Override
  public void setMessage(boolean didItWork, String alias, String secretCode) {
    if (!didItWork) {
      this.message = new Message("Your alias is already in use");
    } else {
      this.message = new Message("Your URL is aliased to " + alias +
          " and your secret code is " + secretCode);
    }
  }

  @Override
  public Message getMessage() {
    return message;
  }

  @Override
  public String incrementHitCount(String alias) {
      for (Link link : repo.findAllBy()) {
        if (link.getAlias().equals(alias)) {
          link.setHitCount(link.getHitCount() + 1);
          repo.save(link);
          return "redirect:" + link.getUrl();
        }
    }
    return "redirect:/notfound";
  }

  @Override
  public List<Link> getAllLinks() {
    return repo.findAllBy();
  }

  @Override
  public void deleteLinkIfPossible(Long id, String secretCode) {
    for (Link link : repo.findAllBy()) {
      if (repo.findById(id).isPresent() && link.getSecretCode().equals(secretCode)) {
        repo.delete(link);
      }
    }
  }

  @Override
  public boolean checkIfExist(Long id) {
    Optional<Link> optionalLink = repo.findById(id);
    return optionalLink.isPresent();
  }

  @Override
  public boolean checkCodeIsExist(String secretCode, Long id) {
    Link link = repo.findById(id).get();
    if(link.getSecretCode().equals(secretCode)){
      return true;
    }
    return false;
  }
}
