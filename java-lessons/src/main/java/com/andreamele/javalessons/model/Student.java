package com.andreamele.javalessons.model;

public class Student extends Person {
    private String course;

    public Student(String firstname, String lastname, String taxId,String course){
        super(firstname,lastname,taxId);
        this.course = course;
    }

}
