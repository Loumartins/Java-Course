package Cap13.polimorfismo.banco.domain;

public class ContaSalario extends Conta {
    private double salarioMensal;

    public ContaSalario(int agencia, int numero, Titular titular, double salarioMensal) {
        super(agencia, numero, titular);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }


    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
