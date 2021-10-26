package com.company.service;

import com.company.Roupa;
import com.company.Tamanho;
import com.company.Tipo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class RoupasFactoryTest {

    Roupa camisa;
    Roupa camisa1;
    Roupa camisa2;
    Roupa meia;

    @BeforeEach
    void doBefore() {
        RoupasFactory factory = new RoupasFactory();
        camisa = factory.getRoupa(Tamanho.XS, Tipo.CAMISA, true, true);
        camisa1 = factory.getRoupa(Tamanho.S, Tipo.CAMISA, true, false);
        camisa2 = factory.getRoupa(Tamanho.M, Tipo.CAMISA, false, true);
        meia = factory.getRoupa(Tamanho.XS, Tipo.MEIA, true, false);
    }

    @Test
    void getRoupa() {
        assertSame(camisa, new RoupasFactory().getRoupa(Tamanho.XS, Tipo.CAMISA, true, true));
    }

    @Test
    void getTamanhoFabrica() {
        Integer tamanhoFabrica = Roupa.getContador();
        assertEquals(2, tamanhoFabrica);
    }

}
