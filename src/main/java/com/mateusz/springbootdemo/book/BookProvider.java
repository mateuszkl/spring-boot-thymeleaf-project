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
public class BookProvider {

    private Map<Long, Book> bookMap = new HashMap<>();

    @PostConstruct
    public void initialize() {
        Author henryk = new Author("Henryk", "Sienkiewicz", LocalDate.of(1846, 6, 5));

        bookMap.put(1L, new Book(henryk, "Quo Vadis", 1896, Genre.HISTORICAL_NOVEL));
        bookMap.put(2L, new Book(henryk, "Quo Vadis", 1896, Genre.HISTORICAL_NOVEL));
    }

    public Book getById(Long id) {
        return bookMap.get(id);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(bookMap.values());
    }
}
