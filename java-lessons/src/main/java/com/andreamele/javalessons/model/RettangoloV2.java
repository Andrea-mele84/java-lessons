package com.andreamele.javalessons.model;

public class RettangoloV2 extends Quadrilatero{

    public RettangoloV2(double base1, double base2, double altezza1, double altezza2) {
        super(base1 , base2 ,altezza1 ,altezza2);
    }

    public void setBase1(double base1) {
        this.base1  = base1;
    }

    public void setBase2(double base2) {
        this.base2  = base2;
    }

    public double getBase1() {
        return base1;
    }
    public double getBase2() {
        return base2;
    }

    public void setAltezza1 (double altezza1){
        this.altezza1 = altezza1;
    }

    public void setAltezza2 (double altezza2){
        this.altezza2 = altezza2;
    }


    public double getAltezza1 () {
        return altezza1;
    }
    public double getAltezza2 () {
        return altezza2;
    }

    @Override
    public double getPerimetro () {
        double sommaBase = base1 + base2;
        double sommaAltezza = altezza1 + altezza2;
        return ((sommaBase + sommaAltezza));
    }
    @Override
    public double getArea () {
        double base = base1 ;
        double altezza =altezza1 ;
        return (base * altezza );
    }
}
