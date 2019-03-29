package com.company;

public class NonFiction extends Book {

    public NonFiction() {
        setPrice(37.99);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

}
