package com.andreamele.javalessons;

import com.andreamele.javalessons.model.Professor;
import com.andreamele.javalessons.model.RettangoloV2;
import com.andreamele.javalessons.model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class MainMap {
    public static void main(String[] args) {

        Professor professore1 = new Professor("1010", "Andrea5");
        Professor professore2 = new Professor("1100", "Enzo5");
        Professor professore3 = new Professor("1234", "Giuann0");

        professore1.setDepartment("Informatica");
        professore2.setDepartment("Informatica");
        professore3.setDepartment("Informatica");


        Student studente1 = new Student("Salvatore", "111");
        Student studente2 = new Student("Francesca", "222");


        studente1.setCourse("Base Dati");
        studente2.setCourse("Algoritmi");





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

        aggiungiStudente(professoreStudenti, professore2, studente1);

        ArrayList<Student> studentiDiGiuann = new ArrayList<>();
        studentiDiGiuann.add(studente2);

        professoreStudenti.put(professore3, studentiDiGiuann);

        aggiungiStudente(professoreStudenti, professore3, studente1);


        System.out.println(" la mappa è " + professoreStudenti);

        //in seguito viene rimosso lo studente Francesca da Prof Giuann

        rimuoviStudente(professoreStudenti,professore3,studente2);

        System.out.println(" la mappa aggiornata è " + professoreStudenti);


    }


    private static void aggiungiStudente(HashMap<Professor, ArrayList<Student>> professoreStudenti, Professor chiave, Student nuovoStudente) {
        ArrayList<Student> studentiDelProfessore = professoreStudenti.get(chiave);
        studentiDelProfessore.add(nuovoStudente);
    }

    private static void rimuoviStudente(HashMap<Professor, ArrayList<Student>> professoreStudenti, Professor chiave, Student studenteDaRimuovere) {
        ArrayList<Student> studentiDelProfessore = professoreStudenti.get(chiave);
        if (studentiDelProfessore != null) {
            studentiDelProfessore.remove(studenteDaRimuovere);
        }
    }

}

