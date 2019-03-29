package com.company;

public class BookArray {


    public static void main(String[] args) {
        Fiction fiction1=new Fiction("fic1");
        Fiction fiction2=new Fiction("fic2");
        Fiction fiction3=new Fiction("fic3");
        Fiction fiction4=new Fiction("fic4");
        Fiction fiction5=new Fiction("fic5");
        NonFiction nonFiction1=new NonFiction("nfic1");
        NonFiction nonFiction2=new NonFiction("nfic2");
        NonFiction nonFiction3=new NonFiction("nfic3");
        NonFiction nonFiction4=new NonFiction("nfic4");
        NonFiction nonFiction5=new NonFiction("nfic5");
        Book[] books={fiction1,fiction2,fiction3,fiction4,fiction5,nonFiction1,nonFiction2,nonFiction3,nonFiction4,nonFiction5};
        for (Book book: books){
            System.out.println(book.getTitle()+" : "+book.getPrice());
        }
    }
}
