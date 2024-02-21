package cap27.streams.exercicios.ex3;

import java.util.Comparator;
import java.util.List;

public class ProdutoTest {
    /*
    Implemente um programa que utilize streams para ordenar uma lista
    de objetos Produto com base no preço, em ordem decrescente.
     */
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto("Leite", 4.50);
        cadastroProduto.adicionarProduto("Cerveja", 6.20);
        cadastroProduto.adicionarProduto("Farinha de trigo", 2.20);
        cadastroProduto.adicionarProduto("Pão de forma", 5.20);

        List<Produto> produtos = cadastroProduto.obterProdutos();

        produtos.stream()
                .map(Produto::getPreco)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
