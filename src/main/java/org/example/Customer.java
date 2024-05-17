package org.example;


import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final int id;
    private final String name;
    private final List<Book> booksOrdered;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.booksOrdered = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooksOrdered() {
        return booksOrdered;
    }

    public void addBookToOrder(Book book) {
        booksOrdered.add(book);
    }

    public void removeBookFromOrder(Book book) {
        booksOrdered.remove(book);
    }
}

