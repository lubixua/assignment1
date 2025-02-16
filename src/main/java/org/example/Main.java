package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Library library = context.getBean(Library.class);

        library.showBooks();

        System.out.println();

        Book primaryBook = context.getBean(Book.class);
        System.out.println("Primary book: " + primaryBook);
    }
}