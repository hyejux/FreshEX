package com.example.demo.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ReservationListDTO {

  private int orderNumber;
  private String mainCategoryName;
  private String subCategoryName;
  private String subSubCategoryName;

}