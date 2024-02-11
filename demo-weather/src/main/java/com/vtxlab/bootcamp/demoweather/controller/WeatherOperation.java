package com.vtxlab.bootcamp.demoweather.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.vtxlab.bootcamp.demoweather.model.Weather;

public interface WeatherOperation {

  @GetMapping(value = "/weathers" )
  Weather getWeathers() ;
  
}
