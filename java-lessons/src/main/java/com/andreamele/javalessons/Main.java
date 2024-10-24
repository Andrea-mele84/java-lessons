package com.andreamele.javalessons;

import com.andreamele.javalessons.model.User;

public class Main {
    public static void main(String[] args) {
        User meleAndrea = new User();
        meleAndrea.setFistname("Andrea");
        meleAndrea.setlastname("Mele");
        meleAndrea.setTaxId("MLENDR84L26F839L");

        System.out.println("Nome utente: " + meleAndrea.getFirstname());
        System.out.println("Cognome utente: " + meleAndrea.getlastname());
        System.out.println("Id utente: " + meleAndrea.getTaxId());
    }
}
