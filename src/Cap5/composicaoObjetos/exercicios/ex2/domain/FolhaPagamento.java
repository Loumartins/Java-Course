package Cap5.composicaoObjetos.exercicios.ex2.domain;

public class FolhaPagamento {
    public double calcularSalario(int qtdHorasTrabalhadas, int qtdHorasExtras, ContratoTrabalho contratoTrabalho){
        double salarioNormal = qtdHorasTrabalhadas * contratoTrabalho.valorNormal;
        double salarioExtra = qtdHorasExtras * contratoTrabalho.valorExtra;
        double salarioFinal = salarioNormal + salarioExtra;
        return salarioFinal;
    }
}
