package Cap25.LambdasExpressions.main;

import Cap25.LambdasExpressions.domain.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest01 {
    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Sabao", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

        //Iterando nos produtos utilizando o forEach buscando apenas o nome dos produtos
        //produtos.forEach(produto -> System.out.println(produto.getNome()));

        //zerando quantidades antes de imprimir
        Consumer<Produto> consumerZerado = produto -> produto.setQuantidade(0);
        Consumer<Produto> consumerImprimir = System.out::println;

        //utilizando o metodo default andThen
        produtos.forEach(consumerZerado.andThen(consumerImprimir));

        //Iterando nos produtos com for.
//        for (Produto produto : produtos) {
//            System.out.println(produto);
//        }
    }
}
