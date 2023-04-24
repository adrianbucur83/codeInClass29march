package org.example.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) throws ValidationException {
        if (book == null) {
            throw new ValidationException("Book can't be null");
        }
        if (book.numberOfPages <= 20) {
            throw new ValidationException("Number of pages must be greater than 20");
        }
        if (book.title == null || book.title.equalsIgnoreCase("")) {
            throw new ValidationException("Book title must not be empty");
        }
        bookList.add(book);
        System.out.println("we added book " + book + " to the library");
    }


}
