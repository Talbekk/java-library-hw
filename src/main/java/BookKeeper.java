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

    public int numberOfBooks(){
        return this.bookCase.size();
    }

    public void borrowBook(Book book){
        this.bookCase.add(book);
    }
    public void returnBook(){
        this.bookCase.remove(0);
    }
    public void borrowBookFromLibrary(Library library){
        Book book = library.removeBook();
        this.borrowBook(book);
    }

}
