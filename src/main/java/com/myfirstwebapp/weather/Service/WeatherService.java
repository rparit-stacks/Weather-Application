package com.myfirstwebapp.weather.Service;

import com.myfirstwebapp.weather.DTO.Forecastday;
import com.myfirstwebapp.weather.DTO.Root;
import com.myfirstwebapp.weather.Model.WeatherDetail;
import com.myfirstwebapp.weather.Model.WeatherForecast;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
@CrossOrigin
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;
    @Value("${weather.api.url}")
    private String apiUrl;
    @Value("${weather.api.forecast.url}")
    private String forecastApiUrl;


    private final RestTemplate myTemplate = new RestTemplate();

    public WeatherDetail getWeatherDetails(String city) {
        String weatherApiUrlPath = apiUrl + "?key=" + apiKey + "&q=" + city;
        Root response = myTemplate.getForObject(weatherApiUrlPath, Root.class);

        assert response != null;
        WeatherDetail weatherDetail = new WeatherDetail(
                response.location.getName(), response.location.getRegion(),
                response.location.getCountry(),response.current.getTemp_c(),
                response.current.getTemp_f(),response.current.condition.getText()
        );

        return  weatherDetail;

    }


    public ArrayList<WeatherForecast> getForecastWeatherDetails(String city, int days) {

        String forecastUrl = forecastApiUrl + "?key=" + apiKey + "&q=" + city + "&days=" + days;
        Root response = myTemplate.getForObject(forecastUrl, Root.class);

        ArrayList<WeatherForecast> weatherForecasts = new ArrayList<>();

        if (response != null && response.forecast != null && response.forecast.getForecastday() != null) {
            for (Forecastday temp : response.forecast.getForecastday()) {
                WeatherForecast weatherForecast = new WeatherForecast(
                        temp.getDate(),
                        temp.getDay().getMaxtemp_c(), temp.getDay().getMaxtemp_f(),
                        temp.getDay().getMintemp_c(), temp.getDay().getMintemp_f(),
                        temp.getDay().getAvgtemp_c(), temp.getDay().getAvgtemp_f(),
                        response.location.getName(),
                        response.location.getRegion(),
                        response.location.getCountry(),
                        response.current.getCondition().getText()
                );
                weatherForecasts.add(weatherForecast);
            }
        }

        return weatherForecasts;
    }




    public String health() {
        return "working fine";
    }
}
