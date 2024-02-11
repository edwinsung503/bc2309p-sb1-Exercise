package com.vtxlab.bootcamp.demoweather.service;

import java.util.List;
import com.vtxlab.bootcamp.demoweather.model.Weather;

public interface WeatherService {
  
  List<Weather> getWeathers();
}
