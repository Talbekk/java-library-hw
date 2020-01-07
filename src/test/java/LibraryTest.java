import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before

    public void before(){
        library = new Library("Alexandria", "Egypt");
        book = new Book("The Lord of the Rings", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void hasName(){
        assertEquals("Alexandria", library.getName());
    }

    @Test
    public void hasLocation(){
        assertEquals("Egypt", library.getLocation());
    }

    @Test

    public void collectionStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
}
