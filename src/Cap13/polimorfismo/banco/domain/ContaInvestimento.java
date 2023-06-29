package Cap13.polimorfismo.banco.domain;

public class ContaInvestimento extends Conta {

    private double valorTotalInvestimento;

    public ContaInvestimento(int agencia, int numero, Titular titular) {
        super(agencia, numero, titular);
    }

    public double getValorTotalInvestimento() {
        return valorTotalInvestimento;
    }

    public void creditarRendimentos(double percentualJuros ){
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalInvestimento += valorRendimentos;
        depositar(valorRendimentos);
    }

    @Override
    public boolean possuiGratuidadeDeImpressao() {
        return getValorTotalInvestimento() > 0;
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "valorTotalInvestimento=" + valorTotalInvestimento +
                "} " + super.toString();
    }
}
