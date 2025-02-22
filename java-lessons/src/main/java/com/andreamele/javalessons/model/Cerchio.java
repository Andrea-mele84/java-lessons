package com.andreamele.javalessons.model;

public class Cerchio implements FiguraGeometrica{

    private double raggio;
    private final double PI_GRECO = Math.PI;


    public Cerchio(double raggio) {
        this.raggio = raggio;
    }
        public void setRaggio(double raggio){
        this.raggio = raggio;
    }
     public double getRaggio() {
         return raggio;
     }
    @Override
    public double getPerimetro() {
        return 2 * PI_GRECO * raggio;
    }
    @Override
    public double getArea () {
        return PI_GRECO * raggio * raggio;
         }

}
