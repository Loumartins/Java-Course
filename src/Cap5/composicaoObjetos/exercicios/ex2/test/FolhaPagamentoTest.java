package Cap5.composicaoObjetos.exercicios.ex2.test;

import Cap5.composicaoObjetos.exercicios.ex2.domain.FolhaPagamento;

import java.util.Locale;

public class FolhaPagamentoTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        int qtdHorasTrabalhadas = 20;
        int qtdHorasExtras = 6;
        double valorExtra = 30.40;
        double valorNormal = 65.00;
       double salario = folhaPagamento.calcularSalario(qtdHorasTrabalhadas, qtdHorasExtras,
               valorNormal, valorExtra);
        System.out.printf("O salario do funcionário no final do mês é de R$%.2f%n", salario);
    }
}
