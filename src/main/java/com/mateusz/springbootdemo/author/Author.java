package com.mateusz.springbootdemo.author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    private String name;
    private String surname;
    private LocalDate birthDate;

    public String getFullName() {
        return name + " " + surname;
    }
}
