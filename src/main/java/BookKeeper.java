import java.util.ArrayList;

public class BookKeeper {

    private String name;
    private ArrayList<Book> bookCase;

    public BookKeeper(String name) {
        this.name = name;
        this.bookCase = new ArrayList<Book>();
    }

    public String getName(){
        return this.name;
    }
}
