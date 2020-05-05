package com.greenfoxacademy.restapi.controller;

import com.greenfoxacademy.restapi.domain.AppendA;
import com.greenfoxacademy.restapi.domain.DoUntil;
import com.greenfoxacademy.restapi.domain.Doubling;
import com.greenfoxacademy.restapi.domain.Greeter;
import com.greenfoxacademy.restapi.domain.ResponseError;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping(value = "/")
  public String mainPage() {
    return "index";
  }

  @GetMapping("/doubling")
  public ResponseEntity<?> doubling(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.ok(new ResponseError("Please provide an input!"));
    }
    Doubling doubling = new Doubling(input);
    return ResponseEntity.ok(doubling);
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> greeter(@RequestParam(required = false) String name,
                                   @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return ResponseEntity.badRequest().body(new ResponseError("Please provide a name and a title!"));
    } if (name == null) {
      return ResponseEntity.badRequest().body(new ResponseError("Please provide a name!"));
    } if (title == null) {
      return ResponseEntity.badRequest().body(new ResponseError("Please provide a title!"));
    }
    return ResponseEntity.ok().body(new Greeter(name, title));
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appendA(@PathVariable String appendable) {
    return ResponseEntity.ok().body(new AppendA(appendable));
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody DoUntil doUntil) {
    if (action.equals("sum")) {
        doUntil.setSumAction();
        return ResponseEntity.ok().body(doUntil);
      } else if (action.equals("factor")){
      doUntil.setFactorialAction();
      return ResponseEntity.ok().body(doUntil);
    }
    return ResponseEntity.ok().body(new ResponseError("No number provided"));
    }
  @PostMapping("/arrays")
  public ResponseEntity<?> arrayHandler(@PathVariable String action, @RequestBody DoUntil doUntil) {
    if (action.equals("sum")) {
      doUntil.setSumAction();
      return ResponseEntity.ok().body(doUntil);
    } else if (action.equals("factor")){
      doUntil.setFactorialAction();
      return ResponseEntity.ok().body(doUntil);
    }
    return ResponseEntity.ok().body(new ResponseError("No number provided"));
  }


}
