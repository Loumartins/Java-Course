package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.Produto;
import Cap5.composicaoObjetos.domain.ServicoDePrecificacao;

public class ServicoDePrecificacaoTest {
    public static void main(String[] args) {
        Produto.custoEmbalagem = 10;
        Produto novoProduto = new Produto();
       // novoProduto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(100);


        //System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de custo: %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
    }
}
