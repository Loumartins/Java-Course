package cap27.streams.estoque.test;

import cap27.streams.estoque.domain.CadastroProduto;
import cap27.streams.estoque.domain.Categoria;
import cap27.streams.estoque.domain.Fabricante;
import cap27.streams.estoque.domain.Produto;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class EstoqueTest01 {
    public static void main(String[] args) {
        var cadastroDeProdutos = new CadastroProduto();
        List<Produto> produtos = cadastroDeProdutos.obterTodos();

//        operacoes de reduçoes especiais

        int totalEstoque = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .sum();

        System.out.println(totalEstoque);

        double mediaEstoque = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .average()
                .orElseThrow(() -> new RuntimeException("Valores não encontrados"));

        System.out.println(mediaEstoque);

        long totalProdutosComEstoque = produtos.stream()
                .filter(Produto::temEstoque)
                .count();

        System.out.println(totalProdutosComEstoque);

        System.out.println("------------------------------");
//        operaçoes de redução min - max
//        buscando a menor quantidade de produto em estoque
        int menorQuantidadeEmEstoque = produtos.stream()
                .filter(Produto::temEstoque)
                .mapToInt(Produto::getQuantidade)
                .min()
                .orElseThrow(() -> new RuntimeException("Menor quantidade nao " +
                        "encontrado"));
        System.out.println(menorQuantidadeEmEstoque);

        System.out.println("-------------------------");
//      buscando o produto mais barato que tem em estoque

        Produto produtoMaisBarato = produtos.stream()
                .filter(Produto::temEstoque)
                .min(Comparator.comparing(Produto::getPreco))
                .orElseThrow(() -> new RuntimeException("Produto mais barato nao " +
                        "encontrado"));

        System.out.println(produtoMaisBarato);
    }
}
