package com.mateusz.springbootdemo.book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksPresenter {

    private final BookProvider bookProvider;

    public BooksPresenter(BookProvider bookProvider) {
        this.bookProvider = bookProvider;
    }

    @GetMapping("/all")
    public String getBooks(Model model) {
        List<Book> books = bookProvider.getBooks();

        model.addAttribute("books", books);
        return "books";
    }

}
