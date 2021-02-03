package com.example.rentomojo.activities;

public class ModelClass {

    private int cityImage;
    private String cityName;

    public ModelClass(int cityImage, String cityName) {
        this.cityImage = cityImage;
        this.cityName = cityName;
    }

    public int getCityImage() {
        return cityImage;
    }

    public String getCityName() {
        return cityName;
    }
}
