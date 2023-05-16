package Cap5.composicaoObjetos.exercicios.ex2.test;

import Cap5.composicaoObjetos.exercicios.ex2.domain.ContratoTrabalho;
import Cap5.composicaoObjetos.exercicios.ex2.domain.FolhaPagamento;

import java.util.Locale;

public class FolhaPagamentoTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        int qtdHorasTrabalhadas = 20;
        int qtdHorasExtras = 6;
        ContratoTrabalho ct = new ContratoTrabalho();

        ct.valorExtra = 30.40;
        ct.valorNormal = 65.00;

       double salario = folhaPagamento.calcularSalario(qtdHorasTrabalhadas, qtdHorasExtras,
              ct);
        System.out.printf("O salario do funcionário no final do mês é de R$%.2f%n", salario);
    }
}
