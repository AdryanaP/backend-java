package com.company;

import model.Funcionario;
import model.FuncionarioContratado;
import model.FuncionarioEfetivo;
import model.Tipo;
import service.PagamentoService;
import service.impl.CalculoSalarialContratado;
import service.impl.CalculoSalarialEfetivo;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, PagamentoService> serviceMap = Map.of("Contratado", new CalculoSalarialContratado(), "Efetivo", new CalculoSalarialEfetivo());

        Funcionario efetivo = new FuncionarioEfetivo("Jose", "Silva", "345673", Tipo.EFETIVO, 2400.35);
        Funcionario contratado = new FuncionarioContratado("Maria", "Gomes", "567845", Tipo.CONTRATADO, 175, 35.00);

        PagamentoService service = serviceMap.get("Efetivo");
        service.pagar(efetivo);
        PagamentoService service2 = serviceMap.get("Contratado");
        service2.pagar(contratado);
    }
}
