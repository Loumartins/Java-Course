package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.Produto;

public class ServicoDePrecificacaoTest2 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Produto.custoEmbalagem = 10;

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }
}
