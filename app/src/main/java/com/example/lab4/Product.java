package com.example.lab4;

public class Product {
    private int imgURL;
    private String name;
    private String shop;

    public Product(int imgURL, String name, String shop) {
        this.imgURL = imgURL;
        this.name = name;
        this.shop = shop;
    }

    public int getImgURL() {
        return imgURL;
    }

    public void setImgURL(int imgURL) {
        this.imgURL = imgURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}
