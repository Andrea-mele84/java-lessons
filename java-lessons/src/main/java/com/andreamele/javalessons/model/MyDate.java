package com.andreamele.javalessons.model;

public class MyDate {
    /*definizione variabili della classe
     visibilità tipo nome variabile;
     */

    private int day;
    private int month;
    private int year;

   /*
   definizione metodi
   visibilità tipo di ritorno nome del metodo (argomenti facoltativi)
    */
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return this.day;
    }

    public void setMonth(int mese){
        month = mese;
    }
    public int getMonth(){
         return month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
   //26-7-1984
    public void printDate(){
        System.out.println( day + "-" + month + "-" + year);
    }
}

