package com.andreamele.javalessons.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class ProfessorEqualsTest {

    @Test
    void testEqualsSameProfessoridNoDepartmentSet() {
        Professor professore1 = new Professor("12345","professor123");
        Professor professore2 = new Professor("6789","professor123");

        Assertions.assertEquals(professore1,professore2);
    }

    @Test
    void testEqualsProfessoridAndDepartment() {
        Professor professore1 = new Professor("12345","professor123");
        Professor professore2 = new Professor("6789","professor123");

        professore1.setDepartment("Informatica");
        professore2.setDepartment("Informatica");

        Assertions.assertEquals(professore1,professore2);
    }

    @Test
    void testNotEqualsProfessoridAndDepartment() {
        Professor professore1 = new Professor("12345","professor123");
        Professor professore2 = new Professor("12345","professor123");

        professore1.setDepartment("Informatica");
        professore2.setDepartment("Fisica");

        Assertions.assertNotEquals(professore1,professore2);

    }

    @Test
    void testNotEqualsProfessoridAndDepartmentNull() {
        Professor professore1 = new Professor("12345","professor123");
        Professor professore2 = new Professor("12345","professor123");

        professore1.setDepartment("Informatica");

        Assertions.assertNotEquals(professore1,professore2);

    }
    @Test
    void testNotEqualsNoProfessoridAndSameDepartment() {
        Professor professore1 = new Professor("12345","professor123");
        Professor professore2 = new Professor("6789","professor1234");

        professore1.setDepartment("Informatica");
        professore2.setDepartment("Informatica");

        Assertions.assertNotEquals(professore1,professore2);
    }
    @Test
    void testEqualsSameProfessor() {
        Professor professore1 = new Professor("12345","professor123");
        professore1.setDepartment("Informatica");


        Assertions.assertEquals(professore1,professore1);
    }

    @Test
    void testNoEqualsWithNullProfessor() {
        Professor professore1 = new Professor("12345","professor123");
        professore1.setDepartment("Informatica");


        Assertions.assertNotEquals(professore1,null);
    }
}
