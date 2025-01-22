package com.andreamele.javalessons.model;

public class Professor extends Person{
     private String department;

     public Professor(String firstName,String lastName,String department ) {
          super(firstName,lastName);
          this.department = department;

     }
}
