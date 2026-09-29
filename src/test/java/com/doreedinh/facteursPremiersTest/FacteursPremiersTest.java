package com.doreedinh.facteursPremiersTest;

import com.doreedinh.facteursPremiers.FacteursPremiers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.catchThrowable;

public class FacteursPremiersTest {
    @Test
    void devrait_retourner_une_liste_vide(){
        //GIVEN
        int a = 1;

        //WHEN
        List<Integer> result =  FacteursPremiers.generer(a);

        // THEN
        assertThat(result).isEmpty();
    }

    @Test
    void devrait_retourner_une_liste_contenant_2(){
        //GIVEN
        int a = 2;

        //WHEN
        List<Integer> result = FacteursPremiers.generer(a);

        //THEN
        assertThat(result).containsExactly(2);
    }



}
