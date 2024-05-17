package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bookstore {
    private final Map<Integer, Book> books;
    private final List<Customer> customers;

    public Bookstore() {
        this.books = new HashMap<>();
        this.customers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public void removeBook(int bookId) {
        books.remove(bookId);
    }

    public Book getBook(int bookId) {
        return books.get(bookId);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(int customerId) {
        customers.removeIf(c -> c.getId() == customerId);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }
}
