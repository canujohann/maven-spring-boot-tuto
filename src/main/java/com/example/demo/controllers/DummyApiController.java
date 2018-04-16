package com.example.demo.controllers;

import com.example.demo.json.User;

import java.util.Random;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyApiController {

  String[] users = { "道元禅師", "INRI", "孔子", "老子", "ザラスシュトラ", "アブラハム", "モーセ", "ムハンマド"};

  /*
  * Dummy mock for simulate API call
  */
  @GetMapping("/getDummyInfo")
  public User getDummyApi(Model model) {
    // Returns a random name from the users array
    int rnd = new Random().nextInt(users.length);
    User user = new User();
    user.setName(users[rnd]);
    return user;
  }
}
