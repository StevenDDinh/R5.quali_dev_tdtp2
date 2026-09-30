package com.doreedinh.ConversionChiffreRomainTest;

import com.doreedinh.conversionChiffreRomain.ConversionChiffreRomain;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ConversionChiffreRomainTest {
    @Test
    void devrait_retourner_une_chaine_vide_si_0(){
        //GIVEN
        int a = 0;

        //WHEN
        String result = ConversionChiffreRomain.convert(a);

        //THEN
        assertThat(result).isEqualTo("");
    }

    @Test
    void devrait_retourner_I(){
        //GIVEN
        int a = 1;

        //WHEN
        String result = ConversionChiffreRomain.convert(a);

        //THEN
        assertThat(result).isEqualTo("I");
    }

    @Test
    void devrait_retourner_X(){
        //GIVEN
        int a = 10;

        //WHEN
        String result = ConversionChiffreRomain.convert(a);

        //THEN
        assertThat(result).isEqualTo("X");
    }


}
