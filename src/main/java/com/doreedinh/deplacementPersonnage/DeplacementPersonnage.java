package com.doreedinh.deplacementPersonnage;

import java.util.ArrayList;
import java.util.List;

public class DeplacementPersonnage {
    public static String tourner(int n) {
        List<String> list = new ArrayList<>();
        list.add("Nord");
        list.add("Est");
        list.add("Sud");
        list.add("Ouest");

        return list.get(n%4);
    }

}
