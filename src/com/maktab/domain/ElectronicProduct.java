package com.maktab.domain;

public abstract class ElectronicProduct extends Product {
    private String model;
    private String brand;
    private String powerSource;

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
