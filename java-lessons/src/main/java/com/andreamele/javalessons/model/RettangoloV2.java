package com.andreamele.javalessons.model;

public class RettangoloV2 extends Quadrilatero{

    public RettangoloV2(double base, double altezza) {
        super(base, altezza);
    }

    public void setBase(double base) {
        this.base  = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltezza (double altezza){
        this.altezza = altezza;
    }

    public double getAltezza () {
        return altezza;
    }
}
