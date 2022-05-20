package com.maktab.domain;

public abstract class Wearable extends Product{
   private String type;
    private String color ;
    private int size;

    public String getColor() {
        return color;
    }

    public String getType(){return type;}

    public int getSize() {
        return size;
    }
}
