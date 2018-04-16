package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.services.InformationService;;

@Controller
@EnableAutoConfiguration
public class MainController {

  @Autowired
  public InformationService informationService;

  /*
  * Basic method for GET
  */
  @GetMapping("/")
  public String greeting(Model model) {
    model.addAttribute("name", "nick");
    return "greeting";
  }

  /*
  * More complex example with DI
  */
  @GetMapping("/getInformation")
  public String getInformation(Model model) {
    model.addAttribute("name", informationService.getUser());
    return "greeting";
  }


}
