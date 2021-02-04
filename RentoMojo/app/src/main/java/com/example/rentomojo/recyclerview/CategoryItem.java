package com.example.rentomojo.recyclerview;

public class CategoryItem {

    private int image;
    private String itemName;
    private String price;

    public CategoryItem(int image, String itemName, String price) {
        this.image = image;
        this.itemName = itemName;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPrice() {
        return price;
    }
}
