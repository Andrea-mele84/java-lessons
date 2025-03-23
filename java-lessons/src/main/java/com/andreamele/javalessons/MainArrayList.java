package com.andreamele.javalessons;

import com.andreamele.javalessons.model.RettangoloV2;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        RettangoloV2 rettangolo1 = new RettangoloV2(10,20);
        RettangoloV2 rettangolo2 = new RettangoloV2(7,15);
        ArrayList listRettangolo = new ArrayList();
        listRettangolo.add(rettangolo1);
        listRettangolo.add(rettangolo2);

        System.out.println("Stampa la base di tutti i Rettangoli dell'arrayList " );
        for (int i = 0; i < listRettangolo.size(); i++) {
            RettangoloV2 rettangoloIesimo = (RettangoloV2) listRettangolo.get(i);
            System.out.println("La base del rettangolo " + i + ": " + rettangoloIesimo.getBase());
        }
    }
}
