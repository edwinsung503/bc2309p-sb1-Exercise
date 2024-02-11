package com.vtxlab.bootcamp.demoweather.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Weather {

  private String generalSituation;
  private String tcInfo;
  private String fireDangerWarning;
  private String forecastPeriod;
  private String forecastDesc;
  private String outlook;
  private String updateTime;

  
}
