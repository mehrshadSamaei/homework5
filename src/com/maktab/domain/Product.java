package com.maktab.domain;

public abstract class Product extends Base{
    private double price;
    private int count;

    public Product() {
    }

    public Product( double price, int count) {
        this.price = price;
        this.count = count;
    }
    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
