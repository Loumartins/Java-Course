package cap27.streams.estoque.test;

import cap27.streams.estoque.domain.CadastroProduto;
import cap27.streams.estoque.domain.Produto;

import java.util.List;
import java.util.stream.Stream;

public class EstoqueTest01 {
    public static void main(String[] args) {
        var cadastroDeProdutos = new CadastroProduto();
        List<Produto> produtos = cadastroDeProdutos.obterTodos();

        Stream<Produto> stream = produtos.stream();

        //utilizando o metodo filter
        Stream<Produto> streamComEstoque = stream.filter(Produto::temEstoque);

        Stream<Produto> streamComEstoqueInativo = streamComEstoque.filter(Produto::isInativo);
    }
}
