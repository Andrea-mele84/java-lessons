package com.andreamele.javalessons.model;

public class Student extends Person {
    private String course;

    public Student(String taxId,String course){
        super(taxId, lastName);
        this.course = course;
    }

}
