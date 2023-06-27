package Cap12.heranca.banco.domain;

public class ContaInvestimento extends Conta{
    private double valorTotalRendimentos;

        public ContaInvestimento(){
            super();
        }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros){
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos+= valorRendimentos;
        depositar(valorRendimentos);
    }
}
