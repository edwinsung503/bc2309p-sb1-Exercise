package com.vtxlab.bootcamp.demoweather.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.vtxlab.bootcamp.demoweather.model.Warning;
import com.vtxlab.bootcamp.demoweather.model.WarningSummary;
import com.vtxlab.bootcamp.demoweather.model.Weather;

public interface WeatherOperation {

  @GetMapping(value = "/weathers/tc" )
  Weather getWeathers() ;
  
  @GetMapping(value = "/weathers/en" )
  Weather getWeathersEn() ;

  @GetMapping(value = "/warning/tc" )
  List<Warning> getWarningTc() ;

  @GetMapping(value = "/warning/en" )
  List<Warning> getWarningEn() ;

  @GetMapping(value = "/warnsum/tc" )
  WarningSummary getWarningSummaryTc() ;

}
