package org.example.library;

public class Book {

    protected int numberOfPages;
    protected String title;

    @Override
    public String toString() {
        return "Book title: " + title +  " number of pages: " + numberOfPages + " ";
    }
}
