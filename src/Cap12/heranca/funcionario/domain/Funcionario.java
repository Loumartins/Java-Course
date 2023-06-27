package Cap12.heranca.funcionario.domain;


public class Funcionario {
    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    protected double calcularSalario(int horasTrabalhadas){
        double salarioCalculado = horasTrabalhadas * valorHora;
        return salarioCalculado;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno){
        double valorSalario = calcularSalario(horasTrabalhadas);
        return new Holerite(getNome(), mesAno, valorSalario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                '}';
    }
}
