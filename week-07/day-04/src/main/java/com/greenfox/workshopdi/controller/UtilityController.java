package com.greenfox.workshopdi.controller;

import com.greenfox.workshopdi.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UtilityController {

  private UtilityService service;

  @Autowired
  public UtilityController(UtilityService service){
    this.service = service;
  }

  @RequestMapping(value = "/useful", method = RequestMethod.GET)
  public String displayMainPage() {
    return "index";
  }
  @RequestMapping(value = "/useful/colored", method = RequestMethod.GET)
  public String displayColoredPage(Model model) {
    model.addAttribute("backgroundcolor", service.randomColor());
    return "index";
  }
  @RequestMapping(value = "/useful/email", method = RequestMethod.GET)
  public String displayEmailValidator(@RequestParam (defaultValue = "" ,value = "email") String emailAdress
      ,Model model) {
    model.addAttribute("emailadress", emailAdress);
    model.addAttribute("emailcolor",service.validateEmail(emailAdress));
    model.addAttribute("validation",service.validOrNot());
    return "index";
  }
  @RequestMapping(value = "/useful/decoder", method = RequestMethod.GET)
  public String displayDecode(@RequestParam (defaultValue = "" ,value = "word") String word,
                                      @RequestParam (defaultValue = "0" ,value = "number") int number,
                                      Model model) {
    model.addAttribute("decoded",
        number < 0 ? "query param is negative number" : service.caesar(word, number * -1));
    return "index";
  }
  @RequestMapping(value = "/useful/encoder", method = RequestMethod.GET)
  public String displayEncode(@RequestParam (defaultValue = "" ,value = "word") String word,
                                      @RequestParam (defaultValue = "0" ,value = "number") int number,
                                      Model model) {
    model.addAttribute("decoded",
        number < 0 ? "query param is negative number" : service.caesar(word, number));
    return "index";
  }
}
