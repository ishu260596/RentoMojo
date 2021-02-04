package com.example.rentomojo.recyclerview;

public class SelectCityModelClass {

    private int cityImage;
    private String cityName;
    private boolean isSelected;

    public SelectCityModelClass(int cityImage, String cityName) {
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
