package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Book book1 = context.getBean(Book.class);
        System.out.printf("Title: %s\nAuthor: %s\nYear: %d", book1.getTitle(), book1.getAuthor(), book1.getYear());
    }
}