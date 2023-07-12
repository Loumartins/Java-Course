package Cap14.interfaces.empresa.domain;

public class Fazenda extends Empresa {

    private double tamanhoEmHectares;

    public Fazenda(String razaoSocial, double totalFaturamento, double tamanhoEmHectares) {
        super(razaoSocial, totalFaturamento);
        this.tamanhoEmHectares = tamanhoEmHectares;
    }

    public double getTamanhoEmHectares() {
        return tamanhoEmHectares;
    }

    public void setTamanhoEmHectares(double tamanhoEmHectares) {
        this.tamanhoEmHectares = tamanhoEmHectares;
    }

    @Override
    public double calcularLimiteAprovado() {
        return 0;
    }

    @Override
    public double calcularJuros(double valorSolicitado) {
        return 0;
    }
}


