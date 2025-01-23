package com.andreamele.javalessons.model;

import java.time.Instant;
import java.util.Date;

public class Professor extends Person{
     private String department;

     public Professor(String firstname, String lastname, String taxId,String department ) {
          super(firstname,lastname,taxId);
          this.department = department;

     }
}
