package Cap13.polimorfismo.impostos.domain;

public class PessoaFisica extends Pessoa {

    public final int RECEITA_ANUAL_ISENCAO = 5000;
    public final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }


    @Override
    public double calcularImposto() {
       double valorImposto = getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;

       if (receitaAnual <= RECEITA_ANUAL_ISENCAO){
           valorImposto = 0;
       }
       return valorImposto;
    }
}
