import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookKeeperTest {

    private BookKeeper bookKeeper;

    @Before
    public void before(){
        bookKeeper = new BookKeeper("Khan");
    }

    @Test
    public void hasName(){
        assertEquals("Khan", bookKeeper.getName());
    }
}
