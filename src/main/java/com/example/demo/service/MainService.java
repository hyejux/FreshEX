package com.example.demo.service;

import com.example.demo.dto.*;

import java.util.List;

public interface MainService {
  public TestDTO PickSelect();
  public CategoryDTO getCategoryLevel1();
  public List<subCategoryDTO> getCategoryLevel2();
  public void testSumit(CategoryDTO dto);
  public void testSumit2( List<FormDTO> dto);
}
