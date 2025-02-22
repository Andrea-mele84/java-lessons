package com.andreamele.javalessons.model;

public abstract class Quadrilatero implements FiguraGeometrica{

    protected double base;
    protected double altezza;

    public Quadrilatero(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;

    }

    @Override
    public double getPerimetro () {
        return ((base * 2) + (altezza * 2));
    }
    @Override
    public double getArea () {
        return (base * altezza );
    }
}



