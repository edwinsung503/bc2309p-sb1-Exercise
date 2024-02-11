package com.vtxlab.bootcamp.demoweather.dto.gov;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WeatherDTO {
  
  private String forecastDesc;
  private String outlook;
  private String updateTime;

}
