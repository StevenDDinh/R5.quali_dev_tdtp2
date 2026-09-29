package com.doreedinh.deplacementPersonnage;

import java.util.ArrayList;
import java.util.List;

public class DeplacementPersonnage {
    public static List<Integer> generer(int n) {
        List<Integer> listPremier = new ArrayList<>();

        int diviseur = 2;

        while (n>1){
            while(n%diviseur == 0){
                listPremier.add(diviseur);
                n = n/diviseur;
            }
            diviseur++;
        }

        return listPremier;
    }

}
