package Cap25.LambdasExpressions.exercicios.test;

import Cap25.LambdasExpressions.exercicios.domain.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

        //TODO remover funcionarios inativos
         funcionarios.removeIf(funcionario -> !funcionario.isAtivo());
        //TODO ordenar funcionarios pelo valor do salario
        Function<Funcionario, BigDecimal> funcionarioIntegerFunction = Funcionario::getSalario;
        funcionarios.sort(Comparator.comparing(funcionarioIntegerFunction));
//        funcionarios.forEach(System.out::println);



        // TODO iterar e imprimir os funcionarios usando o metodo estatico imprimir
        funcionarios.forEach(FuncionarioTest01::imprimir);

    }

    private static void imprimir (Funcionario funcionario) {
        //TODO implementar a impressao do nome, salario e impostos (20%)
        BigDecimal valorImpostos = new BigDecimal("0.20");
        BigDecimal impostosSobreSalarios = funcionario.getSalario().multiply(valorImpostos);
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Impostos sobre salario: " + impostosSobreSalarios);
        System.out.println("----------------------------");



    }
}
