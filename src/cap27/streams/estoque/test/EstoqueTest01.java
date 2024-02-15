package cap27.streams.estoque.test;

import cap27.streams.estoque.domain.CadastroProduto;
import cap27.streams.estoque.domain.Categoria;
import cap27.streams.estoque.domain.Produto;


import java.util.*;
import java.util.stream.Collectors;


public class EstoqueTest01 {
    public static void main(String[] args) {
        var cadastroDeProdutos = new CadastroProduto();
        List<Produto> produtos = cadastroDeProdutos.obterTodos();

//      coletando elementos do Stream em lista

       List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto-> produto.getCategorias().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(categorias);
    }
}
