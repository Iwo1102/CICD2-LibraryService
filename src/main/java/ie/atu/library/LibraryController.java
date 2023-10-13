package ie.atu.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {
    private LibraryService libraryService;

    @Autowired
    public void setLibraryService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/AddBook")
    public String newBook(@RequestBody Book book) {
        return libraryService.addBook(book);
    }

    @GetMapping("/ListBooks")
    public List listBooks() {
        return libraryService.getBooks();
    }
}
