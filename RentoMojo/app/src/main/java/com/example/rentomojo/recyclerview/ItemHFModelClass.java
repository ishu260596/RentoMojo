package com.example.rentomojo.recyclerview;

public class ItemHFModelClass {
    private int image;
    private String price;
    private String name;

    public ItemHFModelClass(int image, String price, String name) {
        this.image = image;
        this.price = price;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
