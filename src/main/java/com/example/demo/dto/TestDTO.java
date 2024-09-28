package com.example.demo.dto;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TestDTO {

  private int id;
  private String name ;
  private LocalDate expirationDate ;
  private String isActive ;
  private int quantity ;

}
