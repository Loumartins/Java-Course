package Cap15.boasPraticas.banco.loubank;

import Cap15.boasPraticas.banco.javabank.Conta;

import java.util.Objects;

public class ContaComTributacao implements Conta {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;
    private Conta contaOriginal;

    public ContaComTributacao(Conta contaOriginal) {
        Objects.requireNonNull(contaOriginal);
        this.contaOriginal = contaOriginal;
    }


    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        contaOriginal.aplicarEmInvestimento(valor);
    }

    private void debitarImpostoMovimentacao(double valor) {
        contaOriginal.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}
