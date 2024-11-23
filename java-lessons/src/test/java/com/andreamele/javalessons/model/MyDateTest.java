package com.andreamele.javalessons.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyDateTest {

    @Test
    void checkValidDayAndMonthOkWithFebruaryTest(){
        int day = 29;
        int month = 2;
        MyDate dayAndMonthOk = new MyDate(day, month, 2024);
        Assertions.assertDoesNotThrow(() -> dayAndMonthOk.checkValidDayAndMonth(day, month));
    }

    @Test
    void checkValidDayAndMonthKoTest(){
        int day = 30;
        int month = 2;
        MyDate dayAndMonthKo = new MyDate (day, month, 2024);
        Assertions.assertThrows(IllegalArgumentException.class, () -> dayAndMonthKo.checkValidDayAndMonth(day, month));
    }

    @Test
    void checkValidDayAndMonthOkWithNotFebruaryTest(){
        int day = 30;
        int month = 1;
        MyDate dateNotFebruary = new MyDate(day , month, 2024);
        Assertions.assertDoesNotThrow(() -> dateNotFebruary.checkValidDayAndMonth(day, month));
    }

    @Test
    void checkMyDateConstructorWithTwoArgsOKTest(){
        int month = 7;
        int year = 2020;
        int expectedDay =1;
        //Assertions.assertDoesNotThrow(() -> new MyDate(month, year));
        MyDate dateOk = new MyDate(month, year);
        Assertions.assertEquals(expectedDay, dateOk.getDay());

    }
    //per casa testare il ko del checkmydatetwoarguments sopra
    //testare il cstruttore che prende solo anno
}
