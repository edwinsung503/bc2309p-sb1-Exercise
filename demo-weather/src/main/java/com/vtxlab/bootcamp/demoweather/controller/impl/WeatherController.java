package com.vtxlab.bootcamp.demoweather.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.demoweather.controller.WeatherOperation;
import com.vtxlab.bootcamp.demoweather.model.Warning;
import com.vtxlab.bootcamp.demoweather.model.WarningSummary;
import com.vtxlab.bootcamp.demoweather.model.Weather;
import com.vtxlab.bootcamp.demoweather.service.WeatherService;

@RestController
@RequestMapping (value = "/api/v3")
public class WeatherController implements WeatherOperation{

  @Autowired
  private WeatherService weatherService;

  @Override
  public Weather getWeathers() {
    return weatherService.getWeathers();
  }

  @Override
  public Weather getWeathersEn() {
    return weatherService.getWeathersEn();
  }

  @Override
  public List<Warning> getWarningTc() {
    return weatherService.getWarningTc();
  }

  @Override
  public List<Warning> getWarningEn() {
    return weatherService.getWarningEn();
  }
  @Override
  public WarningSummary getWarningSummaryTc() {
    return weatherService.getWarningSummaryTc();
  }
  
}
