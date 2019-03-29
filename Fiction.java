package com.company;

public class Fiction extends Book {

    public Fiction() {
        setPrice(24.99);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

}
