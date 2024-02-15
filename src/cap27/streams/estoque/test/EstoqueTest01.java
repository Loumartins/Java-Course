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

//      coletando elementos da Stream em mapas

        Map<String, Integer> produto = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.toMap(Produto::getNome, Produto::getQuantidade));

        System.out.println(produto);

        System.out.println("--------------------");
//       gerando mapas agrupados

        Map<Fabricante, List<Produto>> produtosPorFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(Produto::getFabricante));
        System.out.println(produtosPorFabricante);

    }
}
