package com.andreamele.javalessons.model;

public class User {
    private String taxId;
    private String firstname;
    private String lastname;
    private MyDate birthday;


    public void setFistname(String name) {
        this.firstname = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String surname) {
        this.lastname = surname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getTaxId() {
        return this.taxId;
    }

    public void setBirthdate(MyDate compleanno) {
        birthday = compleanno;
    }
    public MyDate getBirthday (){
        return birthday;
    }
}




