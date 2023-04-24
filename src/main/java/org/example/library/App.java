package org.example.library;

public class App {
    public static void main(String[] args) {

        Library myLibrary = new Library();

        try {
            myLibrary.addBook(new Novel("", 30, "scifi"));
        } catch (ValidationException e) {
            System.out.println("Please input a valid book - " + e.getMessage());
        }

        System.out.println("Library size " + myLibrary.bookList.size());

    }
}
