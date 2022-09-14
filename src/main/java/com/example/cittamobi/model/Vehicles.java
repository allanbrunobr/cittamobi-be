package com.example.cittamobi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vehicles {

  private String plate;

  private String prefix;

  private boolean wheelchair;

  private boolean climatized;

  private int  prediction;

  private int age;

  private String type;


}
