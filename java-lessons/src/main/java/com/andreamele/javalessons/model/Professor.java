package com.andreamele.javalessons.model;


public class Professor extends Person implements UniversityIdentifiable {
     private String department;
     private String professorId;

     public Professor(String taxId, String professorId) {
          super(taxId);
          this.professorId = professorId;

     }

     public void setDepartment(String department) {
          this.department = department;
     }

     public String getDepartment() {
          return department;
     }

     @Override
     public String getRole() {
          return "Professor";
     }

     @Override
     public String getTaxId() {
          System.out.println("Get TaxId from " + this.getRole());
          String taxid = super.getTaxId();
          System.out.println("Lunghezza taxid " + taxid.length());
          return taxid;
     }

     @Override
     public String getUniversityId() {
          return professorId;
     }

     @Override
     public boolean equals(Object obj) {
          if (obj instanceof Professor) {
               Professor other = (Professor) obj;
               return this.professorId.equals(other.professorId) && this.department.equals(other.department) ;
          } else {
               return false;
          }
     }

     @Override
     public int hashCode() {
          int hash = 7;
        return hash;
     }
}