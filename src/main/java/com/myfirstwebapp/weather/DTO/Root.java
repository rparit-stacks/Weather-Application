package com.myfirstwebapp.weather.DTO;

import lombok.Data;

@Data
public class Root{
    public Location location;
    public Current current;
    public Forecast forecast;
}
