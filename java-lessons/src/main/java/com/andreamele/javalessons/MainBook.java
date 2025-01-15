package com.andreamele.javalessons;

import com.andreamele.javalessons.model.Book;
import com.andreamele.javalessons.model.User;

public class MainBook {
    public static void main(String[] args) {

        // Tipo(classe o tipi semplici come int) nomeOggetto = new costruttore creata nella classe (eventuali parametri)
        Book cleanCode = new Book("Clean Code", "CLN100");
        cleanCode.setAuthor("Andrea", "Mele", "100");
        //Book javaProgrammer = new Book("Java Programmer", "JVA101");

        /*se nella concatenzaione + lascio solo l'oggetto cleanCode mi stampa l'indirizzo di memoria
         se invece scrivo oggetto.metodo/attributi visibili */
        //System.out.println("Il primo libro è " + cleanCode.getTitle());
        //System.out.println("Il secondo libro è " + javaProgrammer.getTitle());
        User cleanCodeAuthor = cleanCode.getAuthor();
        System.out.println("Il cognome dell'autore è " + cleanCodeAuthor.getLastname());

    }
}
