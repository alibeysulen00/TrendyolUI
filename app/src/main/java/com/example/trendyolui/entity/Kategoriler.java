package com.example.trendyolui.entity;

public class Kategoriler {
    private String smallImage;
    private String bigImage;
    private String description;
    private String price;

    public Kategoriler() {
    }

    public Kategoriler(String smallImage, String bigImage, String description, String price) {
        this.smallImage = smallImage;
        this.bigImage = bigImage;
        this.description = description;
        this.price = price;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
