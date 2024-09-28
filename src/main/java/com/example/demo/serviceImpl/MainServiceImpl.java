package com.example.demo.serviceImpl;
import com.example.demo.dto.TestDTO;
import com.example.demo.mapper.MainMapper;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MainService")
public class MainServiceImpl implements MainService {

  @Autowired
  private MainMapper mainMapper;

  @Override
  public TestDTO PickSelect() {
    System.out.println(mainMapper.PickSelect());
    return mainMapper.PickSelect();
  }

}
