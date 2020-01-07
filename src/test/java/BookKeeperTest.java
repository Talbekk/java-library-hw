import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookKeeperTest {

    private BookKeeper bookKeeper;
    private Book book;
    private Library library;

    @Before
    public void before(){
        bookKeeper = new BookKeeper("Khan");
        book = new Book("The Lord of the Rings", "JRR Tolkien", "Fantasy");
        library = new Library("Alexandria", "Egypt", 2);
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

    @Test
    public void canReturnBook(){
        bookKeeper.borrowBook(book);
        bookKeeper.returnBook();
        assertEquals(0, bookKeeper.numberOfBooks());
    }

    @Test
    public void canBorrowABookFromLibrary(){
        library.addBookIfUnderCapacity(book);
        bookKeeper.borrowBookFromLibrary(library);
        assertEquals(1, bookKeeper.numberOfBooks());
        assertEquals(0, library.bookCount());
    }
}
