package com.mateusz.springbootdemo.book;

import com.mateusz.springbootdemo.author.Author;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class BookService {

    private Map<Long, Book> bookMap = new HashMap<>();
    private Long counter;

    @PostConstruct
    public void initialize() {
        Author henryk = new Author("Henryk", "Sienkiewicz", LocalDate.of(1846, 6, 5));

        bookMap.put(1L, new Book(1L, henryk, "Quo Vadis", 1896, Genre.HISTORICAL_NOVEL));
        bookMap.put(2L, new Book(2L, henryk, "Quo Vadis", 1896, Genre.HISTORICAL_NOVEL));
        counter = 3L;
    }

    public Book getById(Long id) {
        return bookMap.get(id);
    }

    public void saveBook(Book book) {
        book.setId(counter);
        book.setAuthor(new Author("Henryk", "Sienkiewicz", LocalDate.of(1846, 6, 5)));
        bookMap.put(counter, book);
        counter++;
    }

    public List<Book> getBooks() {
        return new ArrayList<>(bookMap.values());
    }
}
