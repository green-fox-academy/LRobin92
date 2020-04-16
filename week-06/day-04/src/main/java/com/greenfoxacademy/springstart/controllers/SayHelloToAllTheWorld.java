package com.greenfoxacademy.springstart.controllers;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SayHelloToAllTheWorld {
  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho",
      "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit","Salve", "Ciao", "Kon-nichiwa",
      "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte",
      "Hola", "Jambo", "Hujambo", "Hej","Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào",
      "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  @RequestMapping("/web/sayhellotoall")
  public String greeting(@RequestParam(name = "name")
                             String name, @RequestParam(value = "font") int fontsize,
                         @RequestParam(value = "color") String color, Model model) {
    Random random = new Random();
    int randomIndex = random.nextInt(hellos.length -1);
    model.addAttribute("hellos",hellos[randomIndex]);
    model.addAttribute("name",name);
    model.addAttribute("style","font-size:" + fontsize +"px;color:"+color);

    return "sayhellotoall";
  }
}
