package com.andreamele.javalessons.model;

public class QuadratoV2 extends Quadrilatero{

    public QuadratoV2 (double lato) {

        super(lato,lato,lato,lato);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof QuadratoV2){
            QuadratoV2 other = (QuadratoV2) obj;
            return super.base1 == other.base1 && super.altezza1 == other.altezza1;
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
