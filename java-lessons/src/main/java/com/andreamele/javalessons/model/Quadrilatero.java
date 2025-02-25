package com.andreamele.javalessons.model;

public abstract class Quadrilatero implements FiguraGeometrica{

    protected double base1;
    protected double base2;
    protected double altezza1;
    protected double altezza2;

    public Quadrilatero(double base1, double base2,double altezza1, double altezza2) {
        this.base1 = base1;
        this.altezza1 = altezza1;
        this.base2 = base2;
        this.altezza2 = altezza2;

    }

}



