package com.myfirstwebapp.weather.Controller;

import com.myfirstwebapp.weather.Model.WeatherDetail;
import com.myfirstwebapp.weather.Model.WeatherForecast;
import com.myfirstwebapp.weather.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/weather")
@CrossOrigin
public class WeatherController {

    @Autowired
    public WeatherService weatherService;

    @GetMapping("/health")
    public String health() {
        System.out.println("Health endpoint accessed");
        return weatherService.health();
    }

    @GetMapping
    public WeatherDetail getWeatherDetails(@RequestParam String city) {
        return weatherService.getWeatherDetails(city);
    }

    @GetMapping("forecast")
    public ArrayList<WeatherForecast> getForecastWeatherDetails(
            @RequestParam String city,
            @RequestParam int days) {
        return weatherService.getForecastWeatherDetails(city, days);
    }


}
