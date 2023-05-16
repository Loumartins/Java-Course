package Cap5.composicaoObjetos.exercicios.ex2.domain;

public class FolhaPagamento {
    public double calcularSalario(int qtdHorasTrabalhadas, int qtdHorasExtras, double valorNormal, double valorExtra){
        double salarioNormal = qtdHorasTrabalhadas * valorNormal;
        double salarioExtra = qtdHorasExtras * valorExtra;
        double salarioFinal = salarioNormal + salarioExtra;
        return salarioFinal;
    }
}
