package org.example;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String title;
    private String author;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s. The book was published by %s in %d. ", title, author, year);
    }
}