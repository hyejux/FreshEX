package com.example.demo.dto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CategoryDTO {

  private int id;
  private String name;
  private int parent_id;
  private int level;
  private int price;
  private String content;

}
