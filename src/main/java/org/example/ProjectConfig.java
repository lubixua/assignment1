package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    Library library() {
        var library1 = new Library();
        library1.setLibraryName("The British Library");
        return library1;
    }
}