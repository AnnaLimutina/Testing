package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<>();

    public Library(Book... books) {
        bookList.addAll(Arrays.asList(books));
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                bookList.remove(book);
            }
        }
    }

    public void displayAllBooks() {
        for (Book book : bookList) {
            System.out.printf("Title: %s, Author: %s, Available: %s", book.getTitle(), book.getAuthor(), book.isAvailable());
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public Book findBook(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
