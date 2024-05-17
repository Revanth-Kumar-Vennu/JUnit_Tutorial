import org.example.Book;
import org.example.Bookstore;
import org.example.Customer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookstoreTest {
    private Bookstore bookstore;

    @Before
    public void setUp() {
        bookstore = new Bookstore();
    }

    @Test
    public void testAddBook() {
        Book book = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        bookstore.addBook(book);
        assertEquals(book, bookstore.getBook(1));
    }

    @Test
    public void testRemoveBook() {
        Book book = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        bookstore.addBook(book);
        bookstore.removeBook(1);
        assertNull(bookstore.getBook(1));
    }

    @Test
    public void testAddCustomer() {
        Customer customer = new Customer(1, "John Doe");
        bookstore.addCustomer(customer);
        assertTrue(bookstore.getCustomers().contains(customer));
    }

    @Test
    public void testRemoveCustomer() {
        Customer customer = new Customer(1, "John Doe");
        bookstore.addCustomer(customer);
        bookstore.removeCustomer(1);
        assertFalse(bookstore.getCustomers().contains(customer));
    }

    @After
    public void tearDown() {
        bookstore = null;
    }
}
