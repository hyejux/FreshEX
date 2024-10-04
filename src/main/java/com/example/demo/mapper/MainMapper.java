package com.example.demo.mapper;
import com.example.demo.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {
  public TestDTO PickSelect();
  public CategoryDTO getCategoryLevel1();
  public List<subCategoryDTO> getCategoryLevel2();
  public void testSumit(CategoryDTO dto);
  public void testSumit2( List<FormDTO> dto);
}
