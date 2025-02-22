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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof QuadratoV2){
            QuadratoV2 other = (QuadratoV2) obj;
            return super.base == other.base && super.altezza == other.altezza;
        }
        else {
            return false;
        }

    }
}
