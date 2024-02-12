package com.vtxlab.bootcamp.demoweather.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@NoArgsConstructor
public class Warning {
  
  private List<Warning> details;
  private List<String> contents;
  private String warningStatementCode;
  private String subtype;
  private String updateTime;  
}
