package com.andreamele.javalessons.model;

public abstract class Quadrilatero implements FiguraGeometrica {

    protected double base1;
    protected double base2;
    protected double altezza1;
    protected double altezza2;

    public Quadrilatero(double lato1, double lato2, double lato3, double lato4) {
        this.base1 = lato1;
        this.altezza1 = lato2;
        this.base2 = lato3;
        this.altezza2 = lato4;

    }
    public boolean equals(Object obj) {
        if (obj instanceof Quadrilatero) {
            Quadrilatero other = (Quadrilatero) obj;
            return base1 == other.base1 & base2 == other.base2 & altezza1 == other.altezza1 & altezza2 == other.altezza2;

        } else {
            return false;
        }
    }
    public int hashCode() {
        int hash = 7;
        int base1Integer = (int) base1;
        int base2Integer = (int) base2;
        int altezza1Integer = (int) altezza1;
        int altezza2Integer = (int) altezza2;
        return hash * base1Integer * base2Integer * altezza1Integer * altezza2Integer;
    }
}


