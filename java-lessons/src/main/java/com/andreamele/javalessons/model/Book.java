package com.andreamele.javalessons.model;

public class Book {
    private final String title;
    private User author;
    private final String isbn;


    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;

    }

    public void setAuthor(String firstName, String lastName, String taxid) {
        User author = new User(taxid);
        author.setFistname(firstName);
        author.setLastname(lastName);
        this.author = author;
    }


    public User getAuthor() {
        return author;
    }

}
