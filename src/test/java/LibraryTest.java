import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    @Before

    public void before(){
        library = new Library("Alexandria", "Egypt");
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
}
