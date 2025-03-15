package com.andreamele.javalessons;

import com.andreamele.javalessons.model.QuadratoV2;

public class MainHashCode {
    public static void main(String[] args) {
        QuadratoV2 q1 = new QuadratoV2(20);
        QuadratoV2 q2 = new QuadratoV2(15);

        System.out.println("l'hash code di q1 è " + q1.hashCode());
        System.out.println("l'hash code di q2 è " + q2.hashCode());
    }
}
