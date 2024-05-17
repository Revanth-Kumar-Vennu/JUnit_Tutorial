package org.example;


public class Main {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        // Adding books
        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee", 12.50);
        bookstore.addBook(book1);
        bookstore.addBook(book2);

        // Adding customers
        Customer customer1 = new Customer(1, "John Doe");
        Customer customer2 = new Customer(2, "Jane Smith");
        bookstore.addCustomer(customer1);
        bookstore.addCustomer(customer2);

        // Printing bookstore information
        System.out.println("Books in the Bookstore:");
        for (Book book : bookstore.getBooks().values()) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: $" + book.getPrice());
        }

        System.out.println("\nCustomers in the Bookstore:");
        for (Customer customer : bookstore.getCustomers()) {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getName());
        }
    }
}
