package Cap5.composicaoObjetos.exercicios.ex2.test;

import Cap5.composicaoObjetos.exercicios.ex2.domain.ContratoTrabalho;
import Cap5.composicaoObjetos.exercicios.ex2.domain.FolhaPagamento;
import Cap5.composicaoObjetos.exercicios.ex2.domain.Funcionario;
import Cap5.composicaoObjetos.exercicios.ex2.domain.Holorite;

import java.util.Locale;

public class FolhaPagamentoTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        ContratoTrabalho ct = new ContratoTrabalho();
        Funcionario funcionario = new Funcionario();
        ct.funcionario = funcionario;
        ct.funcionario.qtdFilhos =1;

        ct.valorExtra = 30.40;
        ct.valorNormal = 65.00;

        folhaPagamento.qtdHorasExtras = 4;
        folhaPagamento.qtdHorasTrabalhadas = 7;


        Holorite salario = folhaPagamento.calcularSalario(ct);

        System.out.println("O salario do funcionário no final do mês é de R$"+ salario.resultado);



    }
}
