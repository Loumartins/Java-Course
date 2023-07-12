package Cap14.interfaces.empresa.domain;

public class LojaVarejista extends Empresa {
    private double valorTotalEstoque;

    public LojaVarejista(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularLimiteAprovado() {
        return 0;
    }
}
