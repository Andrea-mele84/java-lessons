package com.andreamele.javalessons;

import com.andreamele.javalessons.model.Book;
import com.andreamele.javalessons.model.User;

public class MainRiferimentoVsValore {

    public static void main (String[] args) {
        int numeroPagine = 5;
        System.out.println("Numero di Pagine nel Main Prima: " + numeroPagine);

        Book bookReference = new Book( "springBook", "10");
        bookReference.updatePagesNumber(numeroPagine);
        System.out.println("Numero di Pagine nel Main Dopo: " + numeroPagine);

        User authorReference = new User("ABC");
        System.out.println("authorReference Prima: " + authorReference.getTaxId());
        bookReference.updateAuthor(authorReference);
        System.out.println("authorReference Dopo: " + authorReference.getTaxId());

        // firma rispettare il nome del Metodo,tipo di parametri con stesso ordine, tipo di ritorno
    }


}
