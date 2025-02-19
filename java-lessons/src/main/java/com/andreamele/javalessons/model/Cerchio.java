package com.andreamele.javalessons.model;

public class Cerchio implements FiguraGeometrica{

    private float raggio;
    private final double PI_GRECO = Math.PI;


    public Cerchio(float raggio) {
        this.raggio = raggio;
    }
        public void setraggio(float raggio){
        this.raggio = raggio;
    }
     public float getraggio() {
         return raggio;
     }
    @Override
    public float getPerimetro() {
        return 2 * PI_GRECO * raggio;
    }
    @Override
    public float getArea () {
        return PI_GRECO * raggio * raggio;
         }

}
