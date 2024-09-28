package com.example.demo.mapper;
import com.example.demo.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {
  public TestDTO PickSelect();
}
