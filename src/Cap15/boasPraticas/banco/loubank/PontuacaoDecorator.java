package Cap15.boasPraticas.banco.loubank;

import Cap15.boasPraticas.banco.javabank.Conta;

public class PontuacaoDecorator extends ContaBaseDecorator {

    private int pontos;

    public PontuacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }


    public int getPontos() {
        return pontos;
    }

    @Override
    public void depositar(double valor) {
        getContaOriginal().depositar(valor);
        pontos+= valor/100;
    }
}
