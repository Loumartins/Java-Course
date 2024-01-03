package Cap25.LambdasExpressions.main;

import Cap25.LambdasExpressions.domain.Produto;
import Cap25.LambdasExpressions.domain.ServicoInativacaoProduto;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Sabao", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

        //utilizando method reference em uma instancia da classe ServicoInativacaoProduto
//        var inativarProduto = new ServicoInativacaoProduto();

        //produto.forEach(inativarProduto::inativar)
        //criando method reference de um metodo estatico de uma classe
        produtos.forEach(ServicoInativacaoProduto::inativar);

        produtos.forEach(System.out::println);



    }
}
