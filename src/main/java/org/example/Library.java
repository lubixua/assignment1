package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {
    private String libraryName;
    private Book book;

    public Book getBook() {
        return book;
    }

    @Autowired
    public void setBook(Book book) {
        this.book = book;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
}