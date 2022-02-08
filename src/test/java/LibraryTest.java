import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before (){
        library = new Library(50);
        book = new Book("Graufallo", "Julia Donaldson", "Fantasy");
    }

    @Test
    public void hasNoBooks(){
        assertEquals(0, library.countBooks());
    }
    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.countBooks() );
    }
    @Test
    public void canHaveCapacity(){
        assertEquals(50, library.getCapacity());
    }

    @Test
    public void canAddToStock(){
        assertEquals(true, library.checkStock());
    }


    @Test
    public void cannotAddToStock(){
        library = new Library(1);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(false,library.checkStock());
    }


}
