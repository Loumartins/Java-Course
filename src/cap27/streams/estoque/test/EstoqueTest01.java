package cap27.streams.estoque.test;

import cap27.streams.estoque.domain.CadastroProduto;
import cap27.streams.estoque.domain.Categoria;
import cap27.streams.estoque.domain.Fabricante;
import cap27.streams.estoque.domain.Produto;


import java.util.*;
import java.util.stream.Collectors;


public class EstoqueTest01 {
    public static void main(String[] args) {
        var cadastroDeProdutos = new CadastroProduto();
        List<Produto> produtos = cadastroDeProdutos.obterTodos();

        // coletando os produtos por fabricante

        Map<String,Long> produtosPorFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                        Collectors.counting()));

        System.out.println(produtosPorFabricante);

        System.out.println("-------------------------------");

        // coletando estoque de produtos por Fabricante

        Map<String, Integer> estoquePorFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                        Collectors.summingInt(Produto::getQuantidade)));

        System.out.println(estoquePorFabricante);


//        outras formas de obter instancias de stream

     }
}
