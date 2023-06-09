package Cap14.interfaces.empresa.domain;

public abstract class EmpresaFinanciavel extends Empresa {

    public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }
    public abstract double calcularLimiteAprovado();
}
