import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Boolean chechStock() {
     if(countBooks() < this.capacity){
         return true;
        }
         return false;
    }
}
