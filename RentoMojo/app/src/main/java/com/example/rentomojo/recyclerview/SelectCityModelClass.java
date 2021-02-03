package com.example.rentomojo.recyclerview;

public class SelectCityModelClass {

    private int cityImage;
    private String cityName;

    public SelectCityModelClass(int cityImage, String cityName) {
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
