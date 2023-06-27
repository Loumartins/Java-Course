package Cap12.heranca.funcionario.domain;

public class Programador extends Funcionario {
    private double valorBonus;
    private boolean temBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    public boolean isTemBonus() {
        return temBonus;
    }

    public void setTemBonus(boolean temBonus) {
        this.temBonus = temBonus;
    }

    @Override
    protected final double calcularSalario(int horasTrabalhadas) {
        if (isTemBonus() == false){
            return super.calcularSalario(horasTrabalhadas);
        }
        return super.calcularSalario(horasTrabalhadas) + valorBonus;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "valorBonus=" + valorBonus +
                "} " + super.toString();
    }
}
