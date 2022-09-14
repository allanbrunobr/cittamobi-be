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
public class Messages {

  private String text;

  private String ts;

  private int companyId;

  private String companyType;

  private String companyName;


}
