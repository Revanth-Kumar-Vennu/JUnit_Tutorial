import org.example.Book;
import org.example.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {
    @Test
    public void testCustomerConstructorAndGetters() {
        Customer customer = new Customer(1, "John Doe");
        assertEquals(1, customer.getId());
        assertEquals("John Doe", customer.getName());
        assertTrue(customer.getBooksOrdered().isEmpty());
    }

    @Test
    public void testAddBookToOrder() {
        Customer customer = new Customer(1, "John Doe");
        Book book = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        customer.addBookToOrder(book);
        assertEquals(1, customer.getBooksOrdered().size());
        assertTrue(customer.getBooksOrdered().contains(book));
    }

    @Test
    public void testRemoveBookFromOrder() {
        Customer customer = new Customer(1, "John Doe");
        Book book = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        customer.addBookToOrder(book);
        customer.removeBookFromOrder(book);
        assertTrue(customer.getBooksOrdered().isEmpty());
    }
}
