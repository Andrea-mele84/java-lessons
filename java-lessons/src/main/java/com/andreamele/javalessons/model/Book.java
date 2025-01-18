package com.andreamele.javalessons.model;

public class Book {
    private final String title;
    private User author;
    private final String isbn;
    private int pagesNumber;


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
// oggetto.metodo(parametro);

    public User getAuthor() {
        return author;
    }

    public void updatePagesNumber(int numeroPagine) {
        numeroPagine = numeroPagine + 1;
        System.out.println("Numero pagine nel Metodo: " + numeroPagine);
    }

    public void updateAuthor(User author) {
        //author = new User("132");
        author.setTaxId("456");
        System.out.println("Author nel Metodo : " + author.getTaxId());
    }

}
