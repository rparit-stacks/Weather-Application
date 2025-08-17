package com.myfirstwebapp.weather.DTO; 
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Forecast{
    public ArrayList<Forecastday> forecastday;

    public ArrayList<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(ArrayList<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }
}
