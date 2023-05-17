package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.Produto;
import Cap5.composicaoObjetos.domain.ServicoDePrecificacao;

public class ServicoDePrecificacaoTest {
    public static void main(String[] args) {
        Produto novoProduto = new Produto();
        novoProduto.precoCusto = 100;


        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
    }
}
