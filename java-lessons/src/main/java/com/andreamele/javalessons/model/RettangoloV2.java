package com.andreamele.javalessons.model;

public class RettangoloV2 extends Quadrilatero{

    public RettangoloV2(double base, double altezza) {
      super (base, altezza,base,altezza);

    }
    public void setBase(double base) {
        this.base1 = base;
        this.base2 = base;
    }

    public double getBase() {
        return base1;

    }
     public void setAltezza(double altezza) {
        this.altezza1 = altezza;
        this.altezza2 = altezza;
     }

     public double getAltezza() {
        return altezza1;
     }

    @Override
    public double getArea() {
        return base1 * altezza1;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base1 + altezza1);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RettangoloV2) {
            return super.equals(obj);
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();

    }

    @Override
    public String toString() {
        return "RettangoloV2{" +
                "altezza1=" + altezza1 +
                ", base1=" + base1 +
                '}';
    }
}
