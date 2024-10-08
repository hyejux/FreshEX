package com.example.demo.dto;
import lombok.*;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class reservationslotsDTO {

  private int reservation_key;
  private LocalDate date;
  private Time time;
  private int slotCount;
  private int slotStatus;
  private Boolean isActive ;

}
