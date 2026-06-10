package com.linkitsoft.multi_languagefoodorderingapp.model;

public class FoodItem {
    private String name;
    private double price;
    private boolean favourite;

    public FoodItem(String name, double price, boolean favourite) {
        this.name = name;
        this.price = price;
        this.favourite = favourite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
