package com.mateusz.springbootdemo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BooksPresenter {

    @Autowired
    private BookProvider bookProvider;

    @RequestMapping("/books")
    public String getBooks(Model model) {
        List<Book> books = bookProvider.getBooks();

        model.addAttribute("books", books);
        return "books";
    }

}
