package ie.atu.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    List books = new ArrayList<Book>();

    public String addBook(Book book) {
        books.add(book);
        return "Book " + book.getTitle() + " added\n";
    }

    public List getBooks() {
       return books;
    }

}
