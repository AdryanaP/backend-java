package com.company;

import com.company.model.Pessoa;
import com.company.server.IVacinacao;
import com.company.server.impl.VacinacaoProxy;
import com.company.server.impl.VacinacaoService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoData.parse("14/10/2021");

        Pessoa pessoa = new Pessoa("Joana", "Arroz", "458745874587", "H1N1", data);

        IVacinacao proxy = new VacinacaoProxy(new VacinacaoService());

        proxy.vacinar(pessoa);

    }
}
