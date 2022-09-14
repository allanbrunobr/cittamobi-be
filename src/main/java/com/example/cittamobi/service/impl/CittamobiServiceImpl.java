package com.example.cittamobi.service.impl;

import com.example.cittamobi.model.Prediction;
import com.example.cittamobi.service.CittimobiService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CittamobiServiceImpl implements CittimobiService {

  private static final String SERVICES = "services";


  public Collection<Prediction> getPredictions() {
    String baseUrl = "https://api.cittamobi.com.br/m3p/js/prediction/stop/5208036,5195544";
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> resultadoMapAPI;
    String resultadoStringJson;

    resultadoMapAPI = restTemplate.getForObject(baseUrl, Map.class);

    try {

      resultadoStringJson = new ObjectMapper().writeValueAsString(resultadoMapAPI);
      JsonObject jsonObjects= JsonParser.parseString(resultadoStringJson).getAsJsonObject();
      JsonArray jsonServiceElements = jsonObjects.get(SERVICES).getAsJsonArray();
      Type collectionType = new TypeToken<Collection<Prediction>>(){}.getType();

      return new Gson().fromJson(jsonServiceElements, collectionType);

    } catch (JsonProcessingException e1) {
       e1.printStackTrace();
    }
    return Collections.emptyList();
  }
}
