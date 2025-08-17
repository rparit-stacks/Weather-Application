package com.myfirstwebapp.weather.Model;

import com.myfirstwebapp.weather.DTO.Forecastday;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
public class WeatherForecast {

    public String date;
    public double maxtemp_c;
    public double maxtemp_f;
    public double mintemp_c;
    public double mintemp_f;
    public double avgtemp_c;
    public double avgtemp_f;
    private String cityName;
    private String region;
    private String country;
    public String conditionText;

    public WeatherForecast(String date, double maxtemp_c, double maxtemp_f, double mintemp_c, double mintemp_f, double avgtemp_c, double avgtemp_f, String cityName, String region, String country, String conditionText) {
        this.date = date;
        this.maxtemp_c = maxtemp_c;
        this.maxtemp_f = maxtemp_f;
        this.mintemp_c = mintemp_c;
        this.mintemp_f = mintemp_f;
        this.avgtemp_c = avgtemp_c;
        this.avgtemp_f = avgtemp_f;
        this.cityName = cityName;
        this.region = region;
        this.country = country;
        this.conditionText = conditionText;
    }
}
