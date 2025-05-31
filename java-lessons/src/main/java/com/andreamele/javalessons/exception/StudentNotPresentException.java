package com.andreamele.javalessons.exception;

public class StudentNotPresentException extends Exception {

    public StudentNotPresentException(String cognome) {
        super("Lo studente " + cognome + " non trovato");
    }
}
