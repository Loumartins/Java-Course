package Cap13.polimorfismo.banco.domain;

public class ContaSalario extends Conta {
    private double salarioMensal;

    public ContaSalario(int agencia, int numero, Titular titular) {
        super(agencia, numero, titular);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }


    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
