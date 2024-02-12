package com.vtxlab.bootcamp.demoweather.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.vtxlab.bootcamp.demoweather.infra.Bcutil;
import com.vtxlab.bootcamp.demoweather.infra.Scheme;
import com.vtxlab.bootcamp.demoweather.model.Warning;
import com.vtxlab.bootcamp.demoweather.model.WarningSummary;
import com.vtxlab.bootcamp.demoweather.model.Weather;
import com.vtxlab.bootcamp.demoweather.service.WeatherService;

@Service
public class WeatherServiceHolder implements WeatherService {
    
  @Value("${api.jsonplaceholder.domain}")
  private String domain;

  @Value("${api.jsonplaceholder.endpoints.traditionalChinese}")
  private String  traditionalChinese;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public Weather getWeathers(){
    //RestTemplate restTemplate = new RestTemplate();
    String url = "https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=flw&lang=tc";
    //String url = Bcutil.getUrl(Scheme.HTTPS, domain,traditionalChinese);
    Weather weathers = restTemplate.getForObject(url, Weather.class);

    return weathers;
  }

    @Override
    public Weather getWeathersEn(){
      //RestTemplate restTemplate = new RestTemplate();
      String url = "https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=flw&lang=en";
      //String url = Bcutil.getUrl(Scheme.HTTPS, domain,traditionalChinese);
      Weather weathers = restTemplate.getForObject(url, Weather.class);

      return weathers;
    }

    @Override
    public List<Warning> getWarningTc(){
      //RestTemplate restTemplate = new RestTemplate();
      String url = "https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=warningInfo&lang=tc";
      //String url = Bcutil.getUrl(Scheme.HTTPS, domain,traditionalChinese);
      Warning response = restTemplate.getForObject(url, Warning.class);

      return response.getDetails();
    }

    @Override
    public List<Warning> getWarningEn(){
      //RestTemplate restTemplate = new RestTemplate();
      String url = "https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=warningInfo&lang=En";
      //String url = Bcutil.getUrl(Scheme.HTTPS, domain,traditionalChinese);
      Warning response = restTemplate.getForObject(url, Warning.class);

      return response.getDetails();
    }
  
    @Override
    public WarningSummary getWarningSummaryTc(){
      //RestTemplate restTemplate = new RestTemplate();
      String url = "https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=warnsum&lang=tc";
      //String url = Bcutil.getUrl(Scheme.HTTPS, domain,traditionalChinese);
      WarningSummary  response = restTemplate.getForObject(url, WarningSummary.class);

      return response;
    }
}
