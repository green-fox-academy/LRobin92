package com.greenfoxacademy.exampleexam.controllers;

import com.greenfoxacademy.exampleexam.models.SecretCode;
import com.greenfoxacademy.exampleexam.services.LinkService;
import com.greenfoxacademy.exampleexam.services.LinkServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class MainController {
  private LinkService service;

  public MainController(LinkServiceImp service) {
    this.service = service;
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("messageInfo", service.getMessage());
    return "index";
  }

  @PostMapping("/save-link")
  public String saveLink(String urlInput, String aliasInput) {
    service.addLink(urlInput, aliasInput);
    return "redirect:/";
  }

  @GetMapping("/a/{alias}")
  public Object getTheURLthroughAlias(@PathVariable String alias) {
    return service.incrementHitCount(alias);
  }

  @GetMapping("/api/links")
  public ResponseEntity<?> getApiLinks() {
    return ResponseEntity.ok().body(service.getAllLinks());
  }

  @DeleteMapping("/api/links/{id}")
  public ResponseEntity<?> deleteLinkById(@PathVariable Long id,
                                          @RequestBody SecretCode secretCode) {
    if (service.checkIfExist(id)){
      if (service.checkCodeIsExist(secretCode.getSecretCode(),id)){
        service.deleteLinkIfPossible(id, secretCode.getSecretCode());
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
      }
      return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @GetMapping("/notfound")
  public ResponseEntity<?> notFound() {
    return ResponseEntity.notFound().build();
  }

}
