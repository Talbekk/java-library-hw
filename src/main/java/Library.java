import java.util.ArrayList;

public class Library {

        private String name;
        private String location;
        private ArrayList<Book> collection;

    public Library(String name, String location) {

        this.name = name;
        this.location = location;
        this.collection = new ArrayList<Book>();
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
}
