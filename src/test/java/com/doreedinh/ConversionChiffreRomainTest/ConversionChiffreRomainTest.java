package com.doreedinh.ConversionChiffreRomainTest;

import com.doreedinh.conversionChiffreRomain.ConversionChiffreRomain;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ConversionChiffreRomainTest {
    @Test
    void devrait_retourner_coucou(){
        //GIVEN
        int a = 0;

        //WHEN
        String result = ConversionChiffreRomain.convert(a);

        //THEN
        assertThat(result).isEqualTo("coucou");
    }


}
