package com.mateusz.springbootdemo.book;

import com.mateusz.springbootdemo.author.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Author author;
    private String title;
    private Integer year;
    private Genre genre;

}
