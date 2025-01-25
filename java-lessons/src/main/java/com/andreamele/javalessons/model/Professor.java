package com.andreamele.javalessons.model;


public class Professor extends Person {
     private String department;

     public Professor( String taxId) {
          super(taxId);

     }
     public void setDepartment(String department) {
          this.department = department;
     }
     public String getDepartment() {
          return department;
     }

     @Override
     public String getRole(){
          return "Professor";
     }
}
