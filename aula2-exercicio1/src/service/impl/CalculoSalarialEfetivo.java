package service.impl;

import model.Funcionario;
import model.FuncionarioEfetivo;
import service.PagamentoService;

public class CalculoSalarialEfetivo extends PagamentoService {
    @Override
    protected Double calcularSalario(Funcionario funcionario) {

        FuncionarioEfetivo efetivo = ((FuncionarioEfetivo) funcionario);
        Double salario = efetivo.getSalarioBase(); //salario base
        salario = salario - (efetivo.getSalarioBase() * efetivo.getDesconto()/100); //salario menos descontos
        salario += (salario * efetivo.getBeneficio()/100); // salario descontado mais beneficios

        return salario;
    }
}
