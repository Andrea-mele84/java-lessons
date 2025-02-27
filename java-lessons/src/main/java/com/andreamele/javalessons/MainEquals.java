package com.andreamele.javalessons;

import com.andreamele.javalessons.model.QuadratoV2;
import com.andreamele.javalessons.model.Quadrilatero;
import com.andreamele.javalessons.model.Rettangolo;
import com.andreamele.javalessons.model.RettangoloV2;

public class MainEquals {
    public static void main(String[] args) {

        QuadratoV2 q1 = new QuadratoV2(15);
        System.out.println("il perimetro del quadrato q1 è " + q1.getPerimetro());
        System.out.println("l'area del quadrato q1 è " + q1.getArea());
        System.out.println();

        QuadratoV2 q2 = new QuadratoV2(20);
        System.out.println("il perimetro del quadrato q2 è " + q2.getPerimetro());
        System.out.println("l'area del quadrato q2 è " + q2.getArea());
        System.out.println();

        QuadratoV2 q3 = new QuadratoV2(15);
        QuadratoV2 q4 = q1;
        RettangoloV2 r1 = new RettangoloV2(15,20);
        System.out.println("il perimetro del rettangolo r1 è " + r1.getPerimetro());
        System.out.println("l'area del rettangolo r1 è " + r1.getArea());

        //System.out.println("q1 è uguale a q2 ? " + q1.equals(q2));
        //System.out.println("q1 è uguale a q3 ? " + q1.equals(q3));
        //System.out.println("q1 è uguale a q4 ? " + q1.equals(q4));

        //System.out.println("q1 è uguale a r1 ? " + q1.equals(r1));


    }
}
