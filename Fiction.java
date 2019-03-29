package com.company;

public class Fiction extends Book {

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    public Fiction() {
        setPrice(24.99);
    }

}
