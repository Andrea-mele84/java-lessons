package com.andreamele.javalessons.model;

public class Professor extends Person{
     private String department;

     public Professor(String taxId,String department ) {
          super(taxId);
          this.department = department;

     }
}
