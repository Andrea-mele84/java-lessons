package com.andreamele.javalessons.model;

public class Student extends Person {
    private String course;

    public Student( String taxId){
        super(taxId);
    }

    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }

    @Override
    public String getRole(){
        return "student";
    }
    @Override
    public String getTaxId (){
        System.out.println("Get TaxId from " + this.getRole());
        return super.getTaxId();
    }
}
