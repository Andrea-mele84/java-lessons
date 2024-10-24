package com.andreamele.javalessons.model;

public class User {
    private String taxId;
    private String firstname;
    private String lastname;

    public void setFistname(String name) {
        this.firstname = name;
    }
    public String getFirstname (){
        return this.firstname;
    }
    public void setlastname(String surname) {
        this.lastname = surname;
    }
    public String getlastname (){
        return this.lastname;
   }
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
    public String getTaxId (){
        return this.taxId;
    }
}
