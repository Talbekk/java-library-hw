import java.util.ArrayList;

public class Library {

        private String name;
        private String location;
        private ArrayList<Book> collection;
        private int capacity;

    public Library(String name, String location, int capacity) {

        this.name = name;
        this.location = location;
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public int bookCount(){
        return this.collection.size();
    }

    public void addBook(Book book){
        this.collection.add(book);
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addBookIfUnderCapacity(Book book){
    if (this.bookCount() < this.capacity){
        this.collection.add(book);
    }
    }

    public Book removeBook() {
        Book bookRemoved = null;
        if (this.bookCount() > 0) {
            bookRemoved = this.collection.remove(0);
        }
        return bookRemoved;
    }
}
