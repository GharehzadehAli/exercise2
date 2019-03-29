package com.company;

abstract public class Book {
    protected   String title;
    protected   double price;

    public Book() {

    }

    public Book(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    abstract public void setPrice(double price);
}
