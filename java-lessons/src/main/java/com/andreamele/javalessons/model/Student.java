package com.andreamele.javalessons.model;

public class Student extends Person implements UniversityIdentifiable {
    private String course;
    private String matriculationNumber;

    public Student(String taxId, String matriculationNumber) {
        super(taxId);
        this.matriculationNumber = matriculationNumber;

    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String getRole() {
        return "student";
    }

    @Override
    public String getTaxId() {
        System.out.println("Get TaxId from " + this.getRole());
        return super.getTaxId();
    }

    @Override
    public String getUniversityId() {
        return matriculationNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.getTaxId().equals(other.getTaxId()) && this.matriculationNumber.equals(other.matriculationNumber);
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        int hash = 7;
        return hash * this.getTaxId().hashCode() * this.matriculationNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + this.getFirstname() + '\'' +
                "course='" + course + '\'' +
                ", matriculationNumber='" + matriculationNumber + '\'' +
                '}';
    }


}