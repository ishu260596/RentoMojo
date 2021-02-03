package com.example.rentomojo.activities;

public class ModelClass {

    private int cityImage;
    private String cityName;
    private boolean isSelected;

    public ModelClass(int cityImage, String cityName,boolean isSelected) {
        this.cityImage = cityImage;
        this.cityName = cityName;
        this.isSelected=isSelected;
    }

    public int getCityImage() {
        return cityImage;
    }

    public String getCityName() {
        return cityName;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
