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
        MyDate birthdayOfAndrea = new MyDate(11,10,1984);
        birthdayOfAndrea.setDay(11);
        birthdayOfAndrea.setMonth(9);
        birthdayOfAndrea.setYear(2020);
        meleAndrea.setBirthdate(birthdayOfAndrea);
        birthdayOfAndrea.printDate();
        meleAndrea.getBirthday().printDate();

        //System.out.println("Anno compleanno:" + meleAndrea.getBirthday().getYear()) ;
        //System.out.println("birthday: " + meleAndrea.getBirthday());
       //System.out.println("birthdayOfAndrea" + birthdayOfAndrea);


        /*get birthday è il return di setBirthday
        il setBirthday è il birthdayOfAndrea
        getBirthday = birthdayOfAndrea
        */

    }
}
