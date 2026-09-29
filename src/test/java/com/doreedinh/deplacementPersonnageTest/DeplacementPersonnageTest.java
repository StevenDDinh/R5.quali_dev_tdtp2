package com.doreedinh.deplacementPersonnageTest;

import com.doreedinh.deplacementPersonnage.DeplacementPersonnage;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DeplacementPersonnageTest {
    @Test
    void devrait_retourner_nord(){
        //GIVEN
        int a = 0;

        //WHEN
        String result = DeplacementPersonnage.tourner(a);

        //THEN
        assertThat(result).isEqualTo("Nord");
    }

    @Test
    void devrait_retourner_est(){
        //GIVEN
        int a = 1;

        //WHEN
        String result = DeplacementPersonnage.tourner(a);

        //THEN
        assertThat(result).isEqualTo("Est");
    }

    @Test
    void devrait_retourner_sud(){
        //GIVEN
        int a = 2;

        //WHEN
        String result = DeplacementPersonnage.tourner(a);

        //THEN
        assertThat(result).isEqualTo("Sud");
    }

    @Test
    void devrait_retourner_ouest(){
        //GIVEN
        int a = 3;

        //WHEN
        String result = DeplacementPersonnage.tourner(a);

        //THEN
        assertThat(result).isEqualTo("Ouest");
    }

    @Test
    void devrait_retourner_nord_avec_4_en_parametre(){
        //GIVEN
        int a = 4;

        //WHEN
        String result = DeplacementPersonnage.tourner(a);

        //THEN
        assertThat(result).isEqualTo("Nord");
    }

    @Test
    void devrait_retourner_est_avec_5_en_parmetre(){
        //GIVEN
        int a = 5;

        //WHEN
        String result = DeplacementPersonnage.tourner(a);

        //THEN
        assertThat(result).isEqualTo("Est");
    }



}
