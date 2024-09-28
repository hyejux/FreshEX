package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

  @GetMapping("/{pageName}.do") // .do 해주세요
  public String page(@PathVariable String pageName, Model model){
    return "home";
  }

}
