package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Book book1 = context.getBean("book2", Book.class);
        Library library = context.getBean(Library.class);

        System.out.println(library.getLibraryName());
        System.out.println(library.getBook());
    }
}