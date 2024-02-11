package com.vtxlab.bootcamp.demoweather.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.vtxlab.bootcamp.demoweather.model.Weather;
import com.vtxlab.bootcamp.demoweather.service.WeatherService;
import com.vtxlab.bootcamp.infra.Bcutil;
import com.vtxlab.bootcamp.infra.Scheme;

@Service
public class WeatherServiceHolder implements WeatherService {
    
  @Value("${api.jsonplaceholder.domain}")
  private String domain;

  @Value("${api.jsonplaceholder.endpoints.traditionalChinese}")
  private String  traditionalChinese;

    @Override
    public Weather getWeathers(){
      RestTemplate restTemplate = new RestTemplate();
      //String url = "https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=flw&lang=tc";
      String url = Bcutil.getUrl(Scheme.HTTPS, domain, traditionalChinese);
      Weather weathers = restTemplate.getForObject(url, Weather.class);

      return weathers;
    }
  
}
