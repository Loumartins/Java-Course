package cap27.streams.estoque.test;

import cap27.streams.estoque.domain.CadastroProduto;
import cap27.streams.estoque.domain.Produto;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EstoqueTest01 {
    public static void main(String[] args) {
        var cadastroDeProdutos = new CadastroProduto();
        List<Produto> produtos = cadastroDeProdutos.obterTodos();











//        trabalhando com findFirst e findAny
//        Optional<Produto> produtoOptional = produtos.stream()
//                .filter(Produto::temEstoque)
//                .filter(Produto::isInativo)
//                .findFirst();
//        findFirst retorna um optional
//
//        Produto produto = produtoOptional.orElseThrow(() -> new RuntimeException("Produto nao encontrado"));
//
//        System.out.println(produto);


//        System.out.println("----------------------------------");


//        criando uma pipeline mais enxuta
//        produtos.stream()
//                .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
//                .filter(Produto::temEstoque)
//                .filter(Produto::isInativo)
//                .forEach(System.out::println);



        /*
        um stream possui 3 partes
        1 = fonte de dados (lista de produto)
        2 = operacoes intermediarias
        3 = operacoes terminais
        * */

//        Stream<Produto> stream = produtos.stream();
//
//        //utilizando o metodo filter
//        Stream<Produto> streamComEstoque = stream.filter(Produto::temEstoque);
//
//        Stream<Produto> streamComEstoqueInativo = streamComEstoque.filter(Produto::isInativo);
//
//        //            produto.ativar();
//        streamComEstoqueInativo.forEach(System.out::println);
//
//
    }
}
