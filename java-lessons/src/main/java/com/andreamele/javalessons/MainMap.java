package com.andreamele.javalessons;

import com.andreamele.javalessons.model.Professor;
import com.andreamele.javalessons.model.RettangoloV2;
import com.andreamele.javalessons.model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class MainMap {
    public static void main(String[] args) {

        Professor professore1 = new Professor("Andrea","10255");
        Professor professore2 = new Professor("Enzo","2055");
        Professor professore3 = new Professor("Giuann","100");

        Student studente1 = new Student("Salvatore10","111");
        Student studente2 = new Student("Francesca20","222");


        HashMap<Professor, ArrayList<Student>> professoreStudenti = new HashMap<>();
        /* Professore Andrea -> associato a studenti (Salvatore , Francesca)
         Professore Enzo -> associato a studentessa ( Francesca )
        Professore Giuann -> associato  a NESSUN STUDENTE
        */
        ArrayList<Student> studentiDiAndrea = new ArrayList<>();
        studentiDiAndrea.add(studente1);
        studentiDiAndrea.add(studente2);

        professoreStudenti.put(professore1, studentiDiAndrea);

        ArrayList<Student> studentiDiEnzo = new ArrayList<>();
        studentiDiEnzo.add(studente2);

        professoreStudenti.put(professore2, studentiDiEnzo);

        // al professore Enzo si aggiunge successivamente Salvatore

        aggiungiStudente(professoreStudenti,professore2, studente1);

        System.out.println(" la mappa è " + professoreStudenti);


    }

    private static void aggiungiStudente(HashMap<Professor, ArrayList<Student>> professoreStudenti,Professor chiave, Student nuovoStudente) {
        ArrayList<Student> studentiDelProfessore = professoreStudenti.get(chiave);
        studentiDelProfessore.add(nuovoStudente);
    }
}
