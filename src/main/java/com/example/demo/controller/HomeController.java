package com.example.demo.controller;
import com.example.demo.dto.TestDTO;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

  @Autowired
  private MainService mainservice;

  @GetMapping("/getItem")
  public TestDTO getItem() {
    System.out.println(mainservice.PickSelect());
    return mainservice.PickSelect();
  }

}
