package com.andreamele.javalessons.model;

import com.andreamele.javalessons.exception.StudentNotPresentException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class RegistroPresenze {

    private HashMap<String,ArrayList<LocalDate>> mappaPresenze = new HashMap<>();
    // <cognome,lista date>


    public void aggiungiPresenza (String cognome, LocalDate data)
    {
        if(!mappaPresenze.containsKey(cognome)){
            mappaPresenze.put(cognome,new ArrayList<>());
        }
        ArrayList<LocalDate> localDates = mappaPresenze.get(cognome);
        localDates.add(data);
    }

    public ArrayList<LocalDate> getPresenze (String cognome) throws StudentNotPresentException
    {
        if(!mappaPresenze.containsKey(cognome)){
            throw new StudentNotPresentException(cognome);
        }
        return mappaPresenze.get(cognome);
    }

    public int getNumeroPresenza (String cognome)
    {
        if(!mappaPresenze.containsKey(cognome)){
            return 0;
        }
        return mappaPresenze.get(cognome).size();

     // in maniera piu dettagliata vedi riga 18
    }
}
