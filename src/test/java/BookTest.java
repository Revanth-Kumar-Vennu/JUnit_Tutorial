import org.example.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void testBookConstructorAndGetters() {
        Book book = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        assertEquals(1, book.getId());
        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
        assertEquals(10.99, book.getPrice(), 0.01);
    }
}
