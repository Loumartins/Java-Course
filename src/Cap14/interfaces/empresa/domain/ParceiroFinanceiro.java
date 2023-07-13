package Cap14.interfaces.empresa.domain;

public class ParceiroFinanceiro extends Empresa{
   private double valorTotalAplicado;

    public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    public double getValorTotalAplicado() {
        return valorTotalAplicado;
    }

    public void adicionarNovaAplicacao(double valorAplicado){
        valorTotalAplicado += valorAplicado;
    }

    @Override
    public double calcularLimiteAprovado() {
        throw new RuntimeException("Não é possivel financiar um parceiro");
    }
}
