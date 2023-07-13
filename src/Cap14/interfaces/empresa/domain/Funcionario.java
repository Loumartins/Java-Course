package Cap14.interfaces.empresa.domain;

public class Funcionario extends EmpresaFinanciavel {

    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        super(nome, 0);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * 5;
    }
}
