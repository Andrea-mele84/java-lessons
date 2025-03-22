package com.andreamele.javalessons;

import com.andreamele.javalessons.model.RettangoloV2;

public class MainArray {
    public static void main(String[] args) {
        RettangoloV2 [] arrayRettangolo = new RettangoloV2[3];
        arrayRettangolo [0] = new RettangoloV2( 10,15);
        arrayRettangolo [1] = new RettangoloV2( 5,10);
        arrayRettangolo [2] = new RettangoloV2( 12,25);

        System.out.println("Stampa la base di tutti i Rettangoli dell'array " );
        for (int i = 0; i < arrayRettangolo.length; i++ ){
            RettangoloV2 iesimoElemento = arrayRettangolo[i];
            System.out.println("Base dell' elemento " + i + " : " + iesimoElemento.getBase() );
        }
    }
}
