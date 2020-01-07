import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookKeeperTest {

    private BookKeeper bookKeeper;
    private Book book;

    @Before
    public void before(){
        bookKeeper = new BookKeeper("Khan");
        book = new Book("The Lord of the Rings", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void hasName(){
        assertEquals("Khan", bookKeeper.getName());
    }

    @Test
    public void bookcaseStartsEmpty(){
        assertEquals(0, bookKeeper.numberOfBooks());
    }

    @Test
    public void addBook(){
        bookKeeper.borrowBook(book);
        assertEquals(1, bookKeeper.numberOfBooks());
    }
}
