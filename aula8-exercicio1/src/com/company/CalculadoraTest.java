package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {

    @Test
    public void retornarZero(){
        Calculadora calc = new Calculadora();
        Assertions.assertEquals(0, calc.sum());
    }

    @Test
    public void retornarSoma() {
        Calculadora calc = new Calculadora();
        Assertions.assertEquals(9, calc.sum(3, 6));
    }
}
