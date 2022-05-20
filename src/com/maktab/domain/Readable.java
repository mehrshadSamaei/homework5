package com.maktab.domain;

public class Readable extends Product{
    private String publisher;
    private int numOfPage;
    private LitterateurType litterateurType;

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public LitterateurType getLitterateurType() {
        return litterateurType;
    }

    public void setLitterateurType(LitterateurType litterateurType) {
        this.litterateurType = litterateurType;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumOfPage() {
        return numOfPage;
    }
}
