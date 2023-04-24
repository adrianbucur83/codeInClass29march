package org.example.library;

public class Novel extends Book{
    public Novel(String title, int numberOfPages, String type) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.type = type;
    }

    private String type;

    @Override
    public String toString() {
        return super.toString() + "is a novel, type is " + type;
    }
}
