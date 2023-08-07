package Cap15.boasPraticas.banco.loubank;

import Cap15.boasPraticas.banco.javabank.Conta;

import java.util.Objects;

public class TributacaoDecorator extends ContaBaseDecorator {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    public TributacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);

    }

    @Override
    public void sacar(double valor) {
        getContaOriginal().sacar(valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void depositar(double valor) {
        getContaOriginal().depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        getContaOriginal().transferir(conta, valor);
        debitarImpostoMovimentacao(valor);
    }


    private void debitarImpostoMovimentacao(double valor) {
        getContaOriginal().sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}
