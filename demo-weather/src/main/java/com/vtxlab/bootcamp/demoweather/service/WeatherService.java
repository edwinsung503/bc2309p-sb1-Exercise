package com.vtxlab.bootcamp.demoweather.service;

import java.util.List;
import com.vtxlab.bootcamp.demoweather.model.Warning;
import com.vtxlab.bootcamp.demoweather.model.WarningSummary;
import com.vtxlab.bootcamp.demoweather.model.Weather;

public interface WeatherService {
  
  Weather getWeathers();

  Weather getWeathersEn();

  List<Warning> getWarningTc();

  List<Warning> getWarningEn();

  WarningSummary getWarningSummaryTc();
}
  