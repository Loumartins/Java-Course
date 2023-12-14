package Cap25.LambdasExpressions.main;

import Cap25.LambdasExpressions.domain.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest01 {
    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Sabao", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

        //removendo produtos utilizando interfaces funcionais
//        produtos.removeIf(produto -> produto.getQuantidade() < 1);

        //separando funcões.
        Predicate<Produto> predicateSemEstoque = produto -> produto.getQuantidade() < 1;
        Predicate<Produto> predicateInativo = produto -> produto.getStatus().equals(Produto.Status.INATIVO);

        //utilizando metodos do predicate para remover produtos sem estoques ou produtos inativos
        produtos.removeIf(predicateSemEstoque.or(predicateInativo));
        for (Produto produto : produtos) {
            System.out.println(produto);
        }


    }
}
