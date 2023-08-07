package Cap15.boasPraticas.banco.loubank;

import Cap15.boasPraticas.banco.javabank.Conta;

public class AuditoriaDecorator extends ContaBaseDecorator{

    private int quantidadeDeOperacoes;

    public AuditoriaDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    public int getQuantidadeDeOperacoes() {
        return quantidadeDeOperacoes;
    }

    @Override
    public void sacar(double valor) {
        quantidadeDeOperacoes++;
        super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        quantidadeDeOperacoes++;
        super.depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        quantidadeDeOperacoes++;
        super.transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        quantidadeDeOperacoes++;
        super.aplicarEmInvestimento(valor);
    }
}
