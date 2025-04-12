package com.andreamele.javalessons;

import com.andreamele.javalessons.model.Professor;
import com.andreamele.javalessons.model.Rettangolo;
import com.andreamele.javalessons.model.RettangoloV2;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {

        RettangoloV2 rettangolo1  = new RettangoloV2(12,6);
        RettangoloV2 rettangolo2 = new RettangoloV2(15,10);
        RettangoloV2 rettangolo3 = new RettangoloV2(12,6);
        RettangoloV2 rettangolo4 = rettangolo1;

        HashSet<RettangoloV2> set = new HashSet<>();
        set.add(rettangolo1);
        set.add(rettangolo2);
        set.add(rettangolo3);
        set.add(rettangolo4);

        System.out.println("La dimensione del set è " + set.size());


        for (RettangoloV2 rettangolo : set) {
            System.out.println(rettangolo);
        }

        System.out.println("Set contiene rettangolo3? " + set.contains(new RettangoloV2(20,6)));

        Professor professor1 = new Professor("Jane", "Doe");
        Professor professor2 = new Professor("Andrea", "Mele");
        Professor professor3 = new Professor("Andrea", "Mele"); ;
        professor2.setDepartment("Informatica");
        professor3.setDepartment("Informatica");

        Set<Professor> professori = new HashSet<>();
        professori.add(professor1);
        professori.add(professor2);
        professori.add(professor3);


        System.out.println("La dimensione di professori è " + professori.size());

        for (Professor professor : professori) {
            System.out.println(professor);
        }







    }
}
