package com.andreamele.javalessons;

import com.andreamele.javalessons.model.RettangoloV2;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainListContrario {
    public static void main(String[] args) {
        LinkedList<RettangoloV2> lista = new LinkedList<>();

        RettangoloV2 rettangolo1 = new RettangoloV2(10,20);
        RettangoloV2 rettangolo2 = new RettangoloV2(7,15);
        RettangoloV2 rettangolo3 = new RettangoloV2(5,12);
        RettangoloV2 rettangolo4 = new RettangoloV2(12,18);

        lista.add(rettangolo1);
        lista.add(rettangolo2);
        lista.add(rettangolo3);
        lista.add(rettangolo4);

        for (int i = lista.size() - 1; i >= 0; i--) {
            RettangoloV2 rettangoloIesimo = (RettangoloV2) lista.get(i);
            System.out.println("La base del rettangolo in ordine " + i + " è : " + rettangoloIesimo.getBase());
        }
    }
}
