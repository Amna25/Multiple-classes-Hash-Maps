import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowBooks;

    public Borrower(){
        this.borrowBooks = new ArrayList<>();
    }


    public int countBooks() {
      return   this.borrowBooks.size();
    }

    public void addBook(Book book){
        this.borrowBooks.add(book);
    }

    public void getBookFromLibrary(Library library) {
        Book book = library.removeBook();
        addBook(book);
    }
}
