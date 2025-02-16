package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Library {
    private String libraryName;
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    @Autowired
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void showBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }
}
