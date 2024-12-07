package com.andreamele.javalessons.model;

public class MyDate {
    /*definizione variabili della classe
     visibilità tipo nome variabile;
     */

    public static int currentYear;
    private int day;
    private int month;
    private int year;

    public MyDate(int year) {
        this(1, year);
    }


    public MyDate(int month, int year){
        this(1, month, year);
        //this.day = 1;
        //this.month = month;
        //this.year = year;
    }

    public MyDate(int day,int month,int year){
        checkValidDay(day);
        checkValidMonth(month);
        checkValidYear(year);
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
        checkValidMonth(mese);
        this.month = mese;
    }
    public int getMonth(){
         return month;
    }
    public void setYear(int year){
        checkValidYear(year);
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
    public void checkValidMonth (int month){
        if (month > 12 || month <=0 ){
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
    }
    public void checkValidYear (int year){
        if (year < 1930 || year >2024) {
            throw new IllegalArgumentException("Year must be between 1930 and 2024");
        }

    }
    public void checkValidDayAndMonth (int day,int month) {
        if (month == 2 && day >= 30) {
            throw new IllegalArgumentException("Day of February must be between 1 and 29");
        }
    }
    public void checkValidMonthAndYear (int month,int year ) {
        if (month == 2 && year >= 30) {
            throw new IllegalArgumentException("Day of February must be between 1 and 29");
        }
    }
}
// classe user Taxid obbligatorio
