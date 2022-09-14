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
public class Prediction {

  private String routeCode;

  private String routeMnemonic;

  private String companyId;

  private String stopId;

  private String serviceId;

  private String serviceMnemonic;

  private String predictionType;

  private int activeVehicles;

  private int scheduledVehicles;

  private Messages[] messages;

  private Vehicles[] vehicles;

  private boolean hasRealTime;
}
