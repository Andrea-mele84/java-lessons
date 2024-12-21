package com.andreamele.javalessons.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class MyDateTest {

    @Test
    void checkValidDayAndMonthOkWithFebruaryTest() {
        int day = 20;
        int month = 2;
        MyDate dayAndMonthOk = new MyDate(day, month, 2024);
        Assertions.assertDoesNotThrow(() -> dayAndMonthOk.checkValidDayAndMonth(day, month));
    }

    @Test
    void checkValidDayAndMonthKoTest() {
        int day = 30;
        int month = 2;
        MyDate dayAndMonthKo = new MyDate(day, month, 2024);
        Assertions.assertThrows(IllegalArgumentException.class, () -> dayAndMonthKo.checkValidDayAndMonth(day, month));
    }

    @Test
    void checkValidDayAndMonthOkWithNotFebruaryTest() {
        int day = 25;
        int month = 1;
        MyDate dateNotFebruary = new MyDate(day, month, 2024);
        Assertions.assertDoesNotThrow(() -> dateNotFebruary.checkValidDayAndMonth(day, month));
    }

    @Test
    void checkMyDateConstructorWithTwoArgsOKTest() {
        int month = 7;
        int year = 2020;
        int expectedDay = 1;
        //Assertions.assertDoesNotThrow(() -> new MyDate(month, year));
        MyDate dateTwoArgsOk = new MyDate(month, year);
        Assertions.assertEquals(expectedDay, dateTwoArgsOk.getDay());

    }

    //per casa testare il ko del checkmydatetwoarguments
    @Test
    void checkMyDateConstructorWithTwoArgsKOForMonthWrongTest() {
        int month = 13;
        int year = 2020;
        //MyDate dateKO = new MyDate(month, year);
        Assertions.assertThrows(IllegalArgumentException.class, () -> new MyDate(month, year)  );

    }
    //testare il costruttore che prende solo anno

    @Test
    void checkMyDateConstructorWithOneArgOKTest() {
        int expectedDay = 1;
        int expectedMonth = 1;
        int year = 2024;
        MyDate oneArg = new MyDate(year);
        Assertions.assertEquals(expectedDay, oneArg.getDay());
        Assertions.assertEquals(expectedMonth, oneArg.getMonth());
        Assertions.assertEquals(year, oneArg.getYear());

    }

    @Test
    void checkMyDateConstructorWithOneArgKOForYearWrongTest() {
        int year = 2025;
        //MyDate oneArg = new MyDate(year);
        Assertions.assertThrows(IllegalArgumentException.class, () -> new MyDate(year) );

    }
}




