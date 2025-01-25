package com.andreamele.javalessons.model;

public abstract class Person {
    private String firstname;
    private String lastname;
    private String taxId;
    private MyDate birthday;

    // classe user Taxid obbligatorio
   public Person(String taxId){
      this.taxId = taxId;
   }

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

    public abstract String getRole();
}




