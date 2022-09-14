package com.example.cittamobi.controller;

import com.example.cittamobi.model.Prediction;
import com.example.cittamobi.service.impl.CittamobiServiceImpl;
import java.util.Collection;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class CittamobiController {
  private final CittamobiServiceImpl cittamobiService;

  @GetMapping(path = "/predictions")
  public Collection<Prediction> getPredictions(){
    return cittamobiService.getPredictions();
  }
}
