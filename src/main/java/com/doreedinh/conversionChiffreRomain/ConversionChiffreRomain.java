package com.doreedinh.conversionChiffreRomain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConversionChiffreRomain {
    public static String convert(int nbr) {
        StringBuilder chiffreRomain = new StringBuilder();
        Map<String,Integer> symboles = Map.of(
                "I", 1,
                "V",5,
                "X",10,
                "L",50,
                "C",100,
                "D",500,
                "M",1000
        );

        if(nbr != 0){
            int millier = nbr/1000;
            int centaine = nbr/100;
            int dizaine = nbr/10;
            symboles.forEach((cle,valeur)->{
                if(nbr == valeur){
                    chiffreRomain.append(cle);
                }


            });
        }
        return chiffreRomain.toString();
    }

}
