package com.company.server.impl;

import com.company.model.Pessoa;
import com.company.server.IVacinacao;

import java.util.Date;

public class VacinacaoProxy implements IVacinacao {

    private  VacinacaoService vacinacaoService;

    public VacinacaoProxy(VacinacaoService vacinacaoService) {
        this.vacinacaoService = vacinacaoService;
    }

    @Override
    public void vacinar(Pessoa pessoa) {

        Date dataAtual = new Date();

        if(pessoa.getDataVacina().before(dataAtual) || pessoa.getDataVacina().equals(dataAtual)) {
            vacinacaoService.vacinar(pessoa);
        } else {
            System.out.println("Ainda não chegou a sua vez, aguarde mais um pouco");
        }

    }
}
