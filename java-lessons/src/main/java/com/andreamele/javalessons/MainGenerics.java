package com.andreamele.javalessons;

import com.andreamele.javalessons.model.Scatola;
import com.andreamele.javalessons.model.Student;

public class MainGenerics {
    public static void main(String[] args) {

        Scatola<String> scatola = new Scatola<>();
        scatola.setValore("Ciao");
        String valore = scatola.getValore();
        System.out.println("il valore della scatola è " + valore);

        Scatola<Integer> scatola2 = new Scatola<>();
        scatola2.setValore(10);
        Integer valore2 = scatola2.getValore();
        System.out.println("il valore della scatola2 è " + valore2);

        Scatola<Student> scatola3 = new Scatola<>();
        Student student = new Student("13456", "555");
        student.setFistname("Andrea");
        scatola3.setValore(student);
        Student valore3 = scatola3.getValore();
        System.out.println("il valore della scatola3 è " + valore3);

    }
}
