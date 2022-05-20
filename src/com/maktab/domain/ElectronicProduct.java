package com.maktab.domain;

public abstract class ElectronicProduct extends Product {
    private String model;
    private String brand;
    private String powerSource;

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
