package com.andreamele.javalessons;


import com.andreamele.javalessons.model.Person;
import com.andreamele.javalessons.model.Professor;
import com.andreamele.javalessons.model.Student;

public class MainPerson {

    public static void main(String[] args) {
        Professor person = new Professor( "MLENDR84l26f839l", "Id45620");
        person.setFistname("Andrea");
        person.setLastname("Mele");
        person.setDepartment("Fisica");

        Professor person2 = new Professor( "KHFL4567KGKELK", "Id45620");
        person2.setFistname("Philip");
        person2.setLastname("Biling");
        person2.setDepartment("Fisica");
        System.out.println("il professore Mele è uguale al Prof Biling ? " + person.equals(person2));

        Student student = new Student("GNGFTRDF4556", "matr45678");
        student.setFistname("Giorgio");
        student.setLastname("Lobotka");
        student.setCourse("Matematica");

        Student student2 = new Student("FGRTFGRT4568989", "matr45678");
        student2.setFistname("Stanislav");
        student2.setLastname("Mazzocchi");
        student2.setCourse("Matematica");
        System.out.println("Lo Studente Lobotka è uguale allo studente Biling ? " + student.equals(student2));


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
