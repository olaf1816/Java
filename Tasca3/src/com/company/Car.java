package com.company;

public class Car {
    private String model,brand ;
    private float price;

    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return this.price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
