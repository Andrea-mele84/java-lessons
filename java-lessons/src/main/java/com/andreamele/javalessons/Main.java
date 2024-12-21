package com.andreamele.javalessons;

import com.andreamele.javalessons.model.User;
import com.andreamele.javalessons.model.MyDate;

public class Main {
    public static void main(String[] args) {
        User meleAndrea = new User("MLENDR84L26F839L");
        meleAndrea.setFistname("Andrea");
        meleAndrea.setLastname("Mele");


        System.out.println("Nome utente: " + meleAndrea.getFirstname());
        System.out.println("Cognome utente: " + meleAndrea.getLastname());
        System.out.println("Id utente: " + meleAndrea.getTaxId());

        //definizione oggetto: nome classe nome oggetto(a scelta camelCase) = new nome classe()
        MyDate birthdayOfAndrea = new MyDate(11,10,1984);
        MyDate.currentYear = 2024;
        System.out.println(MyDate.currentYear);
        MyDate birthdayWithoutDay = new MyDate(2024);
        MyDate.currentYear = 2020;
        System.out.println(MyDate.currentYear);
        System.out.println(MyDate.currentYear);


        birthdayOfAndrea.setDay(9);
        birthdayOfAndrea.setMonth(9);
        birthdayOfAndrea.setYear(2020);
        meleAndrea.setBirthdate(birthdayWithoutDay);
        birthdayOfAndrea.printDate();
        meleAndrea.getBirthday().printDate();



        //System.out.println("Anno compleanno:" + meleAndrea.getBirthday().getYear()) ;
        //System.out.println("birthday: " + meleAndrea.getBirthday());
       //System.out.println("birthdayOfAndrea" + birthdayOfAndrea);


        /*get birthday è il return di setBirthday
        il setBirthday è il birthdayOfAndrea
        getBirthday = birthdayOfAndrea
        */

       /* final MyDate myDateFinal = new MyDate(10,10,1984);
        System.out.println(myDateFinal);
        myDateFinal = new MyDate(15,8,2024);
        System.out.println(myDateFinal);

        */

        /* final:
         sulle variabili: serve a dichiarare variabili costanti ( non possono cambiare il loro valore)
        se la variabile è un oggetto, questo non può cambiare istanza (non puoi fare new due volte)
        se la variabile è primitiva ( int, boolean etc) non puoi assegnare due volte un valore
        sulle classi: serve a dichiare una classe non estendibile ( quella classe non può avere classi figlie)
        sui metodi: servre a dichiarare un metodo non sovrascrivibile dalle sottoclassi
         */

       /* static:
       sulle variabili: serve a dichiarare una vriabile di classe e non di istanza (condivisa tra tutte le istanze)
       sui metodi: vedi variabile su
       sulle classi: viene utilizzata sulle classi interne (inner class), serve per istanziare queste classi interne senza necessità
       di istanziare anche quelle esterne.
        */

    }
}
