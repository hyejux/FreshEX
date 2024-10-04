package com.example.demo.serviceImpl;
import com.example.demo.dto.*;
import com.example.demo.mapper.MainMapper;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
