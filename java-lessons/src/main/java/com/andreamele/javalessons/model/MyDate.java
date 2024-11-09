package com.andreamele.javalessons.model;

public class MyDate {
    /*definizione variabili della classe
     visibilità tipo nome variabile;
     */

    private int day;
    private int month;
    private int year;

    public MyDate(int day,int month,int year){
        checkValidDay(day);
        this.day = day;
        this.month = month;
        this.year =year;
    }

   /*
   definizione metodi
   visibilità tipo di ritorno nome del metodo (argomenti facoltativi)
    */
    public void setDay(int day){
       checkValidDay(day);
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
    public void checkValidDay (int day){
        if (day > 31 || day <=0 ){
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
    }
}
// a casa validazione mese e anno - classe user Taxid obbligatorio
