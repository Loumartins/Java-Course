package Cap14.interfaces.empresa.domain;

public class Funcionario implements PessoaBonificavel {

    private String nome;
    public static final int QUANTIDADE_SALARIOS_LIMITE_CREDITO = 5;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIOS_LIMITE_CREDITO;
    }

    @Override
    public double calcularBonus(double percentualMetaAlcancada) {
        return getSalarioMensal() * percentualMetaAlcancada / 100;
    }
}

