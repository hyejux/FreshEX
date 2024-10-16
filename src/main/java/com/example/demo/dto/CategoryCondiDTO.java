package com.example.demo.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CategoryCondiDTO {

  private String category;
  private int id;
  private String name;
  private int parentId;
  private int level;
  private int price;
  private String content;

  private int condiId;
  private int categoryId;
  private Boolean isRequired;
  private Boolean isPaid;
  private String inputType;

}
