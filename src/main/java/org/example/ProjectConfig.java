package org.example;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

@Configuration
public class ProjectConfig {

    @Bean
    Book book() {
        var book1 = new Book();
        book1.setAuthor("Plato");
        book1.setTitle("Republic");
        book1.setYear(-375);
        return book1;
    }

    @Bean
    @Primary
    Book book2() {
        var book2 = new Book();
        book2.setAuthor("Dostoevsky");
        book2.setTitle("Demons");
        book2.setYear(1872);
        return  book2;
    }

    @Bean
    Book book3() {
        var book3 = new Book();
        book3.setAuthor("Hemingway");
        book3.setTitle("The Old Man and the Sea");
        book3.setYear(1952);
        return book3;
    }

    @Bean
    Library library() {
        Library library1 = new Library();
        library1.setLibraryName("The British Library");
        library1.setBooks(Arrays.asList(book(), book2(), book3()));
        return library1;
    }
}