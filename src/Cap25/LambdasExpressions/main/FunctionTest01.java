package Cap25.LambdasExpressions.main;

import Cap25.LambdasExpressions.domain.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;

public class FunctionTest01 {
    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Sabao", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));


        //utilizando a interface funcional Function para comparação
        Function<Produto, Integer> function1 = Produto::getQuantidade;
        Function<Produto, String> function2 = Produto::getNome;


        //importante lembrar que a function que é argumento do metodo comparing
        //funciona como extrator de um valor de um atributo.
        produtos.sort(Comparator.comparing(function1).thenComparing(function2));

        produtos.forEach(System.out::println);
    }
}
