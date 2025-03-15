package com.andreamele.javalessons.model;

import java.util.Objects;
import java.util.Random;

public class QuadratoV2 extends Quadrilatero{

    public QuadratoV2 (double lato) {

        super(lato,lato,lato,lato);
    }

    public void setLato(double lato) {
        this.base1 = lato;
        this.base2 = lato;
        this.altezza1 = lato;
        this.altezza2 = lato;
    }

    public double getLato() {
        return base1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof QuadratoV2){
            return super.equals(obj);
        }
        else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return super.hashCode();

    }

    @Override
    public double getPerimetro () {
        return  this.base1 * 4;
    }
    @Override
    public double getArea () {
        return  this.base1 * this.base1;
    }
}
