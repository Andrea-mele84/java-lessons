package com.andreamele.javalessons.model;

public class RettangoloV2 extends Quadrilatero{

    public RettangoloV2(double base, double altezza) {
      super (base, altezza,base,altezza);

    }

    @Override
    public double getArea() {
        return base1 * altezza1;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base1 + altezza1);
    }

}
