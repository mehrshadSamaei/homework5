package com.maktab.domain;

public class Shoe extends Wearable {
    private String solMaterial;
    private ShoeType shoeType;

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    public String getSolMaterial() {
        return solMaterial;
    }

    public void setSolMaterial(String solMaterial) {
        this.solMaterial = solMaterial;
    }
}
