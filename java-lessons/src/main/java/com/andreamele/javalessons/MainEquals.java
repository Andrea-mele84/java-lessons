package com.andreamele.javalessons;

import com.andreamele.javalessons.model.QuadratoV2;
import com.andreamele.javalessons.model.RettangoloV2;

public class MainEquals {
    public static void main(String[] args) {

        QuadratoV2 q1 = new QuadratoV2(15);
        QuadratoV2 q2 = new QuadratoV2(20);
        QuadratoV2 q3 = new QuadratoV2(15);
        QuadratoV2 q4 = q1;
        RettangoloV2 r1 = new RettangoloV2(15,20);

        System.out.println("q1 è uguale a q2 ? " + q1.equals(q2));
        System.out.println("q1 è uguale a q3 ? " + q1.equals(q3));
        System.out.println("q1 è uguale a q4 ? " + q1.equals(q4));

        System.out.println("q1 è uguale a r1 ? " + q1.equals(r1));


    }
}
