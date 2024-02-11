package com.vtxlab.bootcamp.demoweather.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.demoweather.controller.WeatherOperation;
import com.vtxlab.bootcamp.demoweather.model.Weather;
import com.vtxlab.bootcamp.demoweather.service.WeatherService;

@RestController
@RequestMapping (value = "/api/v3")
public class WeatherController implements WeatherOperation{

  @Autowired
  private WeatherService weatherService;

  @Override
  public List<Weather> getWeathers() {
    return weatherService.getWeathers();
  }
  
}
