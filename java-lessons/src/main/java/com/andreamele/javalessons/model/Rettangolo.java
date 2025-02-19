package com.andreamele.javalessons.model;

public class Rettangolo implements FiguraGeometrica {

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;

    }
        public void setbase(double base) {
            this.base  = base;
        }

        public double getbase() {
            return base;
        }

        public void setaltezza (double altezza){
            this.altezza = altezza;
        }

        public double getaltezza () {
            return altezza;
        }

        @Override
        public double getPerimetro () {
            return ((base * 2) + (altezza * 2));
        }
        @Override
        public double getArea () {
            return ((base * altezza) / 2);
        }

}