package cap27.streams.estoque.test;

import cap27.streams.estoque.domain.CadastroProduto;
import cap27.streams.estoque.domain.Categoria;
import cap27.streams.estoque.domain.Fabricante;
import cap27.streams.estoque.domain.Produto;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class EstoqueTest01 {
    public static void main(String[] args) {
        var cadastroDeProdutos = new CadastroProduto();
        List<Produto> produtos = cadastroDeProdutos.obterTodos();

        //reduzindo um streams de produtos em BigDecimal -> o valor do estoque total
        BigDecimal valorEmEstoque = produtos.stream()
                .map(produto -> produto.getPreco().multiply(new BigDecimal(produto.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(valorEmEstoque);



//       IntBinaryOperator operadoraSoma = Integer::sum;
//       int totalEstoque =  produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .reduce(0, operadoraSoma);
//
//
//        System.out.println(totalEstoque);

//      refatorando operação

//        int totalEstoque =  produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .reduce(0, Integer::sum);
//        System.out.println(totalEstoque);
//        ------------------------------------------------------------
//       usando as especializações de Stream para inteiros

//        produtos.stream()
//                .filter(Produto::temEstoque)
//                .mapToInt(Produto::getQuantidade)
//                .forEach(System.out::println);


//        ------------------------------------------------------------
//        imprimindo as categorias utilizando a operação map()

//        Stream<Set<Categoria>> stream = produtos.stream()
//                .filter(Produto::temEstoque)
//                .map(Produto::getCategorias);
//
//
//        stream.forEach(obj -> {
//            obj.stream()
//                    .forEach(System.out::println);
//        });
//
//        System.out.println("---------------------------------------");

        //utilizando a operação flatMap() para "achatar" uma stream
//        produtos.stream()
//                .filter(Produto::temEstoque)
//                .flatMap(produto ->produto.getCategorias().stream())
//                .distinct()
//                .forEach(System.out::println);
//      ------------------------------------------------------------

//     utilizando o map()
//       Stream<Fabricante> fabricanteStream = produtos.stream()
//                .filter(Produto::temEstoque)
//                .map(Produto::getFabricante);
//
//       fabricanteStream.forEach(System.out::println);

//     enxugando o codigo e obtendo elementos distintos
//        produtos.stream()
//                .filter(Produto::temEstoque)
//                .map(Produto::getFabricante)
//                .distinct()
//                .forEach(System.out::println);

//       é passado uma interface funcional Function no map para realizar o mapeamento (transformação)
//       no exemplo o map() retorna uma stream de fabricante.
//       para obter elementos distintos é necessario o uso do distinct porem é preciso ter o metodo equals
//       implementado na classe. no caso do exemplo na classe Fabricante.
//      ------------------------------------------------------------
//
//      ordenando elementos de stream utilizando o metodo sorted.
//      caso queira ordenar os elementos de forma natural é preciso que implemente a interface Comparator na classe
//      em questao.
//
//        produtos.stream()
//                .filter(Produto::temEstoque)
//                .sorted(Comparator.comparingInt(Produto::getQuantidade))
//                .forEach(produto -> System.out.printf("%s = %d unidades%n", produto.getNome(), produto.getQuantidade()));
//
//
//     ------------------------------------------------------------
//        trabalhando com anyMatch , allMatch e NoneMatch
//        boolean temProdutoNoEstoque = produtos.stream()
//                .anyMatch(Produto::temEstoque);
//
//        System.out.println(temProdutoNoEstoque);// true;
//
//        boolean todosProdutoPossuemEstoque = produtos.stream()
//                .allMatch(Produto::temEstoque);
//
//        System.out.println(todosProdutoPossuemEstoque);// false;
//
//        boolean nenhumProdutoPossuiEstoque = produtos.stream()
//                .noneMatch(Produto::temEstoque);
//
//        System.out.println(nenhumProdutoPossuiEstoque);//false
//      ------------------------------------------------------------
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


//        ------------------------------------------------------------


//        criando uma pipeline mais enxuta
//        produtos.stream()
//                .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
//                .filter(Produto::temEstoque)
//                .filter(Produto::isInativo)
//                .forEach(System.out::println);


//        ------------------------------------------------------------
        /*
        um stream possui 3 partes
        1 = fonte de dados (lista de produto)
        2 = operacoes intermediarias
        3 = operacoes terminais
        * */

//        ------------------------------------------------------------
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
