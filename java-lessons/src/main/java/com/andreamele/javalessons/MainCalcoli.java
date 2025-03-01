package com.andreamele.javalessons;


import com.andreamele.javalessons.model.*;

public class MainCalcoli {

    public static void main(String[] args) {

        FiguraGeometrica quadrato = new Quadrato(5);
//        System.out.println("il lato del quadrato è " + quadrato.getLato());
        System.out.println("l'Area del quadrato e' " + quadrato.getArea());
        System.out.println("il perimetro del quadrato e' " + quadrato.getPerimetro());

        Rettangolo rettangolo = new Rettangolo(12,15);
        System.out.println();
        System.out.println("la base del rettangolo e' " + rettangolo.getBase());
        System.out.println("l'altezza del rettangolo e' " + rettangolo.getAltezza());
        System.out.println("l'Area del rettangolo e' " + rettangolo.getArea()) ;
        System.out.println("Il Perimetro del rettangolo e' " + rettangolo.getPerimetro());

        Cerchio cerchio = new Cerchio(22);
        System.out.println();
        System.out.println("il raggio del cerchio è " + cerchio.getRaggio());
        System.out.println("la circonferenza del cerchio è " + cerchio.getPerimetro());
        System.out.println("l'Area del cerchio è " + cerchio.getArea());

        QuadratoV2 quadratoV2 = new QuadratoV2(5);
        System.out.println(quadratoV2.getArea());
        System.out.println(quadratoV2.getPerimetro());

    }
}
