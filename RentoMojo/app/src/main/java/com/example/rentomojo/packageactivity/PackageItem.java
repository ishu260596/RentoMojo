package com.example.rentomojo.packageactivity;

public class PackageItem {

    private int image;
    private String name;
    private String productsAvailable;

    public PackageItem(int image, String name, String productsAvailable) {
        this.image = image;
        this.name = name;
        this.productsAvailable = productsAvailable;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getProductsAvailable() {
        return productsAvailable;
    }
}
