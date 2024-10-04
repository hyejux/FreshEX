package com.example.demo.controller;
import com.example.demo.dto.*;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

  @GetMapping("/getCategoryLevel1")
  public CategoryDTO getCategoryLevel1(){
    return mainservice.getCategoryLevel1();
  }

  @GetMapping("getCategoryLevel2")
  public List<subCategoryDTO> getCategoryLevel2(){
    return mainservice.getCategoryLevel2();
  }

  @PostMapping("testSumit")
  public void testSumit(@RequestBody CategoryDTO dto){
    mainservice.testSumit(dto);
  }

  @PostMapping("testSumit2")
  public void testSumit2(@RequestBody List<FormDTO> dto){
    System.out.println(dto);
    mainservice.testSumit2(dto);
  }

}
