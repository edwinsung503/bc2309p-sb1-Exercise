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
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Builder
public class WarningSummary {

  private String name;
  private String code;
  private String type;
  private String actionCode;
  private String issueTime;
  private String updateTime;
  
  
  
}
