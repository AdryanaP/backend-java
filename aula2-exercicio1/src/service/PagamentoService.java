package service;

import model.Funcionario;
import model.Tipo;

import java.text.DecimalFormat;

public abstract class PagamentoService {

    public void pagar(Funcionario funcionario) {
        funcionario.setSalarioFinal(calcularSalario(funcionario));
        String resultado = String.format("%.2f", funcionario.getSalarioFinal());
        System.out.println((depositarSalario(funcionario.getContaBancaria(), resultado)));
        System.out.println(emitirComprovante(funcionario.getTipo()));
    }

    public String depositarSalario(String conta, String salarioFinal) {
        return "Deposito do salario " + salarioFinal + " efetuado na conta " + conta;
    }

    public String emitirComprovante(Tipo tipo) {
        if(tipo == Tipo.CONTRATADO) {
            return "Recibo enviado por E-mail.";
        }else if(tipo == tipo.EFETIVO) {
            return "Recibo impresso com sucesso.";
        } else {
            return "Erro ao emetir recibo.";
        }
    }

    protected abstract Double calcularSalario(Funcionario funcionario);

}
