package com.myfirstwebapp.weather.Model;


public class WeatherDetail {

    private String cityName;
    private String region;
    private String country;
    public double temp_c;
    public double temp_f;
    public String conditionText;

    public WeatherDetail(){

    }

    public WeatherDetail(String cityName, String region, String country, double temp_c, double temp_f, String conditionText) {
        this.cityName = cityName;
        this.region = region;
        this.country = country;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.conditionText = conditionText;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }

    public String getConditionText() {
        return conditionText;
    }

    public void setConditionText(String conditionText) {
        this.conditionText = conditionText;
    }
}
