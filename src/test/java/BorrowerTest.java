import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Graufallo", "Julia Donaldson", "Fantasy");
        library = new Library(50);
    }

    @Test
    public void hasNoBooks(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void addBookToBorrowerCollection(){
        borrower.addBook(book);
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void getBookFromLibrary(){
        library.addBook(book);
        borrower.getBookFromLibrary(library);
        assertEquals(1, borrower.countBooks());
        assertEquals(0,library.countBooks());

    }

}
