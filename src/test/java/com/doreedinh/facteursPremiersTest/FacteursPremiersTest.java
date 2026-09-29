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
        FacteursPremiers prems = new FacteursPremiers();

        //WHEN
        List<Integer> result =  prems.generer(a);

        // THEN
        assertThat(result).isEmpty();
    }

}
