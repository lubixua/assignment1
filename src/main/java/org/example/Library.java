package org.example;

import org.springframework.stereotype.Component;

@Component
public class Library {
    private String libraryName;

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
}