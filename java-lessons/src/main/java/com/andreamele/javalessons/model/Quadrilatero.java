package com.andreamele.javalessons.model;

public abstract class Quadrilatero implements FiguraGeometrica{

    protected double base1;
    protected double base2;
    protected double altezza1;
    protected double altezza2;

    public Quadrilatero(double lato1, double lato2,double lato3, double lato4) {
        this.base1 = lato1;
        this.altezza1 = lato2;
        this.base2 = lato3;
        this.altezza2 = lato4;

    }

}



