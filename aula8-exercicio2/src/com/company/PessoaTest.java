package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    Pessoa pessoa;
    Pessoa pessoa1;
    Pessoa pessoa2;

    @BeforeEach
    void doBefore() {
        pessoa = new Pessoa("Julia", "Silva");
        pessoa.setIdade(LocalDate.of(2001, 12, 21));

        pessoa1 = new Pessoa("Fernando", "Barbara");
        pessoa1.setIdade(LocalDate.of(1995, 11, 12));

        pessoa2 = new Pessoa("Gabriela", "Corte");
        pessoa2.setIdade(LocalDate.of(1987, 11, 12));
    }

    @Test
    void getNomeCompleto() {
        assertEquals("Julia, Silva", pessoa.calcularNomeCompleto());
    }

    @Test
    void getEMaiorDeIdade() {
        assertEquals(pessoa.eMaiorDeIdade(), true);
    }
}
