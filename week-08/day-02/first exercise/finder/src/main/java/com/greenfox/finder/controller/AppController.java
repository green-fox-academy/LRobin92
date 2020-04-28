package com.greenfox.finder.controller;

import com.greenfox.finder.service.UserService;
import com.greenfox.finder.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

    private UserService service;

    @Autowired
    public AppController(UserService service) {
        this.service = service;
    }


    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("users", service.getAll());
        return "main";
    }
    @GetMapping(value = "/app")
    public String appMapping() {
        return "redirect:/";
    }

    @PostMapping(value = "/app")
    public String create(@ModelAttribute User user) {
        service.save(user);
        return "redirect:/";
    }
}