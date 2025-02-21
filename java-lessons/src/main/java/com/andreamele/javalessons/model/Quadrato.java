package com.andreamele.javalessons.model;

public class Quadrato implements FiguraGeometrica {

    private double lato;


    public Quadrato (double lato) {
        this.lato = lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    @Override
    public double getPerimetro() {
        return (lato * 4) ;
    }
    @Override
    public double getArea() {
        return (lato * lato);
    }
}
