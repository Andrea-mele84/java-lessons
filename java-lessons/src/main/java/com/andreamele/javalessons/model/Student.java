package com.andreamele.javalessons.model;

public class Student extends Person implements UniversityIdentifiable {
    private String course;
    private String matriculationNumber;

    public Student( String taxId, String matriculationNumber){
        super(taxId);
        this.matriculationNumber = matriculationNumber;

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
    @Override
    public String getUniversityId(){
        return matriculationNumber;
    }
}
