package org.example;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    Library library() {
        Library library1 = new Library();
        library1.setLibraryName("The British Library");
        library1.setBook(book());
        return library1;
    }
}