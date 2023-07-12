package Cap14.interfaces.empresa.domain;

public abstract class Empresa {
    private String razaoSocial;
    private double totalFaturamento;

    public abstract double calcularLimiteAprovado();
    public abstract double calcularJuros(double valorSolicitado);
}
