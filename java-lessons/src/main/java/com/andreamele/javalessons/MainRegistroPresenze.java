package com.andreamele.javalessons;

import com.andreamele.javalessons.exception.StudentNotPresentException;
import com.andreamele.javalessons.model.RegistroPresenze;

import java.time.LocalDate;

public class MainRegistroPresenze {
    public static void main(String[] args) /*throws StudentNotPresentException*/ {

        RegistroPresenze registroPresenze = new RegistroPresenze();
        registroPresenze.aggiungiPresenza("Mele", LocalDate.parse("2025-02-01"));
        registroPresenze.aggiungiPresenza("Mele", LocalDate.parse("2025-02-02"));

        try {
            System.out.println("Presenze dell'alunno Esposito sono: " +registroPresenze.getPresenze("Esposito"));
            System.out.println("Presenze dell'alunno Mele sono: " +registroPresenze.getPresenze("Mele"));
        }
        catch (StudentNotPresentException e) {
           e.printStackTrace();
        }

        System.out.println("Totale presenze dell'alunno Mele sono: " +registroPresenze.getNumeroPresenza("Mele"));
    }
}

