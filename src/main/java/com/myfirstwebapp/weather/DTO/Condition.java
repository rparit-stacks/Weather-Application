package com.myfirstwebapp.weather.DTO;

import lombok.Data;

@Data
public class Condition{
    public String text;
    public String icon;
    public int code;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
