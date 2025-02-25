package com.andreamele.javalessons.model;

public class QuadratoV2 extends Quadrilatero{

    public QuadratoV2 (double lato) {

        super(lato,lato,lato,lato);
    }

    public void setLato(double lato) {
        super.base1 = lato;
        super.base2 = lato;
        super.altezza1 = lato;
        super.altezza2 = lato;
    }

    public double getLato() {
        return this.base1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof QuadratoV2){
            QuadratoV2 other = (QuadratoV2) obj;
            return super.base1 == other.base2 && super.altezza1 == other.altezza2 && super.altezza2 == other.altezza1;
        }
        else {
            return false;
        }

    }
    @Override
    public double getPerimetro () {
        return  this.base1 * 4;
    }
    @Override
    public double getArea () {
        return  this.base1 * this.altezza1;
    }
}
