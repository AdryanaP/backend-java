package com.company.server.impl;

import com.company.model.Pessoa;
import com.company.server.IVacinacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VacinacaoService implements IVacinacao {

    @Override
    public void vacinar(Pessoa pessoa) {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataAtualFormada = formato.format(new Date());

        System.out.println(pessoa.getNome() + " portador do RG: " + pessoa.getRg() +
                " está apto para tomar a vacina " + pessoa.getVacina() +
                " no dia " + dataAtualFormada);

    }
}
