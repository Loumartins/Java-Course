package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.ServicoDePrecificacao;

public class ServicoDePrecificacaoTest {
    public static void main(String[] args) {
        double precoCompraFornecedor = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);

        System.out.printf("Preço: %.2f%n", precoCompraFornecedor);
    }
}
