package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraTest {

    @Test
    void perimetroQuadrado() {
        Quadrado quadrado = new Quadrado(5.0);
        assertEquals(20, quadrado.calcularPerimetro());
    }

    @Test
    void perimetroCirculo() {
        Circulo circulo = new Circulo(12.0);
        assertEquals(75.39822368615503, circulo.calcularPerimetro());
    }
}
