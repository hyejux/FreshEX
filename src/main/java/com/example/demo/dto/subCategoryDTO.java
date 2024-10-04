package com.example.demo.dto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class subCategoryDTO {

  private int id;
  private String name;
  private int price;
  private int subId;
  private String subName;
  private int subPrice;
  private int parentId;
  private String parentName;
  private String parentContent;
  private int parentPrice;
  private Boolean isRequired;
  private Boolean isPaid;
  private String inputType;

}
