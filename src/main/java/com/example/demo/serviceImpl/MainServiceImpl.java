package com.example.demo.serviceImpl;
import com.example.demo.dto.*;
import com.example.demo.mapper.MainMapper;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service("MainService")
public class MainServiceImpl implements MainService {

  @Autowired
  private MainMapper mainMapper;

  @Override
  public TestDTO PickSelect() {
    System.out.println("service" + mainMapper.PickSelect());
    return mainMapper.PickSelect();
  }

  @Override
  public CategoryDTO getCategoryLevel1() {
    return mainMapper.getCategoryLevel1();
  }

  @Override
  public List<subCategoryDTO> getCategoryLevel2() {
    return mainMapper.getCategoryLevel2();
  }

  @Override
  public void testSumit(CategoryDTO dto) {
   mainMapper.testSumit(dto);
  }

  @Override
  public void testSumit2( List<FormDTO> dto) {
    mainMapper.testSumit2(dto);
  }

  @Override
  @Transactional
  public void insertFirstCategory(CategoryCondiDTO dto) {
    System.out.println("카테고리입니다");
    mainMapper.insertFirstCategory(dto);
  }

  @Override
  public void insertSecondCategory(CategoryCondiDTO dto) {
    System.out.println("카테고리입니다중분류");
    mainMapper.insertSecondCategory(dto);
    mainMapper.insertCategoryDetails(dto);

  }

  @Override
  public void insertLastCategory(CategoryCondiDTO dto) {
    System.out.println("카테고리입니다소분류");
    mainMapper.insertLastCategory(dto);
  }

  @Override
  public List<reservationslotsDTO> getDateTime(LocalDate date) {
   return mainMapper.getDateTime(date);
  }


}
