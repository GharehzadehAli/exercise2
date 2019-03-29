package com.company;

public class UseBook {
    public static void main(String[] args) {
        Fiction fiction=new Fiction("Harry Potter");
        System.out.println(fiction.getTitle()+" : "+fiction.getPrice());
        NonFiction nonFiction=new NonFiction("War and Peace");
        System.out.println(nonFiction.getTitle()+" : "+nonFiction.getPrice());

    }
}
