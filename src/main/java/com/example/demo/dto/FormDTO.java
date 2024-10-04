package com.example.demo.dto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class FormDTO {
  private int id;
  private int mainCategoryId;
  private int subCategoryId;
  private int subSubCategoryId;
  private String inputValue;
  private int price ;
}
