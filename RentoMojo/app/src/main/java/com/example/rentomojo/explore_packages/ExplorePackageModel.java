package com.example.rentomojo.explore_packages;

public class ExplorePackageModel {
    private int image;
    private String name;
    private String price;
    private String item;

    public ExplorePackageModel(int image, String name, String price, String item) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.item = item;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getItem() {
        return item;
    }
}
