package com.mateusz.springbootdemo.book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public String getBooks(Model model) {
        List<Book> books = bookService.getBooks();

        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/add")
    public String redirectToAddBook() {
        return "addBook";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String saveBook(@ModelAttribute Book book, Model model) {
        bookService.saveBook(book);
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);

        return "books";
    }

    @ModelAttribute("book")
    public Book createModel() {
        return new Book();
    }

}
