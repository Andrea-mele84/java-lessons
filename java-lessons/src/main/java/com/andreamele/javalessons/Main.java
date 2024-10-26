package com.andreamele.javalessons;

import com.andreamele.javalessons.model.User;
import com.andreamele.javalessons.model.MyDate;

public class Main {
    public static void main(String[] args) {
        User meleAndrea = new User();
        meleAndrea.setFistname("Andrea");
        meleAndrea.setLastname("Mele");
        meleAndrea.setTaxId("MLENDR84L26F839L");

        System.out.println("Nome utente: " + meleAndrea.getFirstname());
        System.out.println("Cognome utente: " + meleAndrea.getLastname());
        System.out.println("Id utente: " + meleAndrea.getTaxId());

        //definizione oggetto: nome classe nome oggetto(a scelta camelCase) = new nome classe()
        MyDate birthdayOfAndrea = new MyDate();
        birthdayOfAndrea.setDay(26);
        birthdayOfAndrea.setMonth(7);
        birthdayOfAndrea.setYear(1984);
        meleAndrea.setBirthdate(birthdayOfAndrea);
        System.out.println("Anno compleanno:" + meleAndrea.getBirthday().getYear());


    }
}
