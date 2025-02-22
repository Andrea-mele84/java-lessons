package com.andreamele.javalessons.model;

public class QuadratoV2 extends Quadrilatero{

    public QuadratoV2 (double lato) {

        super(lato, lato);
    }

    public void setLato(double lato) {
        super.base = lato;
        super.altezza = base;
    }

    public double getLato() {
        return super.base;
    }




}
