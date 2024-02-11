package com.vtxlab.bootcamp.demoweather.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.vtxlab.bootcamp.demoweather.model.Weather;
import com.vtxlab.bootcamp.demoweather.service.WeatherService;

@Service
public class WeatherServiceHolder implements WeatherService {

    

    @Override
    public List<Weather> getWeathers(){
      RestTemplate restTemplate = new RestTemplate();
      String url = "https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=flw&lang=en";
      Weather weathers = restTemplate.getForObject(url, Weather.class);

      return Arrays.stream(weathers).;
    }
  
}
