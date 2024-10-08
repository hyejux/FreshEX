package com.example.demo.controller;
import com.example.demo.dto.*;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
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

  @PostMapping("getDateTime")
  public List<reservationslotsDTO> getDateTime(@RequestBody reservationslotsDTO dto){
    LocalDate date = dto.getDate();
    System.out.println(date);
    return mainservice.getDateTime(date);
  }

  @PostMapping("testSumit3")
  public void testSumit3(@RequestBody List<CategoryCondiDTO> dto){
      System.out.println(dto);
      int parentId = -1;
      int subparentId = -1;
      for (CategoryCondiDTO categoryCondiDTO : dto) {
        if (categoryCondiDTO.getCategory().equals("대분류")) {
          mainservice.insertFirstCategory(categoryCondiDTO);
          parentId = categoryCondiDTO.getId(); // 대분류 ID 저장
          System.out.println("ID 이당 ::: " + categoryCondiDTO.getId());
        } else if (categoryCondiDTO.getCategory().equals("중분류")) {
          if (parentId != -1) {
            categoryCondiDTO.setParentId(parentId);
            mainservice.insertSecondCategory(categoryCondiDTO);
            subparentId = categoryCondiDTO.getId();
          } else {
            throw new IllegalStateException("중분류를 추가하기 전에 대분류가 필요합니다.");
          }
        }else if (categoryCondiDTO.getCategory().equals("소분류")){
          if (categoryCondiDTO.getName() != null) {
            categoryCondiDTO.setParentId(subparentId);
            mainservice.insertLastCategory(categoryCondiDTO);
          }else {
            return;
          }
        }
      }
  }

}
