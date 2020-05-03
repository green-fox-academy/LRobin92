package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private PostServiceImpl service;

  @Autowired
  public MainController(PostServiceImpl service) {
    this.service = service;
  }

  @GetMapping(value = {"/"})
  public String mainPage(Model model) {
    model.addAttribute("posts", service.getAllPosts());
    return "main";
  }
  @GetMapping(value = {"/addpost"})
  public String addNewPost() {
    return "postcreate";
  }

  @PostMapping(value = {"/addpost"})
  public String postAddNewPost(@RequestParam String addPost) {
    service.savePost(new Post(addPost));
    return "redirect:/";
  }
  @GetMapping("/{id}/downvote")
  public String getDownVote(@PathVariable(value = "id") Long id) {
    service.downVoteScore(id);
    return "redirect:/";
  }
  @GetMapping("/{id}/upvote")
  public String getUpVote(@PathVariable(value = "id") Long id) {
    service.upVoteScore(id);
    return "redirect:/";
  }
}
