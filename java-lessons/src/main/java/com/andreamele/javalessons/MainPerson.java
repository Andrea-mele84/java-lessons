package com.andreamele.javalessons;


import com.andreamele.javalessons.model.Person;
import com.andreamele.javalessons.model.Professor;
import com.andreamele.javalessons.model.Student;

public class MainPerson {

    public static void main(String[] args) {
        Professor person = new Professor( "MLENDR84l26f839l", "Id45612");
        person.setFistname("Andrea");
        person.setLastname("Mele");

        Student student = new Student("GNGFTRDF4556", "matr12345");
        student.setFistname("Giorgio");
        student.setLastname("Mazzocchi");
        student.setCourse("Matematica");


        System.out.println("Il Professore si chiama " + person.getFirstname() + " " + person.getLastname());
        System.out.println("Il suo codice fiscale è " + person.getTaxId());
        System.out.println("L'identificativo del Professore è " + person.getUniversityId());


        System.out.println("\nLo Studente si chiama " + student.getFirstname() + " " + student.getLastname());
        System.out.println("Il suo corso è " + student.getCourse());
        System.out.println("L'identificativo dello Studente è " + student.getUniversityId());


        //toLowerCaseTaxId(student);
        //toLowerCaseTaxId(person);
    }

    public static void toLowerCaseTaxId(Person person) {
        String taxId = person.getTaxId();
        String taxIdLowerCase = taxId.toLowerCase();
        person.setTaxId(taxIdLowerCase);
        System.out.println("Classe = " + person.getClass() + " TaxId = " + person.getTaxId());
    }
}
