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

    public Book removeBook(){
        return this.books.remove(0);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Boolean checkStock() {
     if(countBooks() < this.capacity){
         return true;
        }
         return false;
    }


}
