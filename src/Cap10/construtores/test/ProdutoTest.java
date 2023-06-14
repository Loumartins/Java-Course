package Cap10.construtores.test;

import Cap10.construtores.domain.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto( "Picanha 1kg (Peça)");
        Produto produto2 = new Produto( "Maminha 1kg (Peça)",10);
        Produto produto3 = new Produto();

        System.out.println(produto1.quantidadeEstoque);
        System.out.println(produto2.quantidadeEstoque);

        System.out.println(produto1.codigo);
        System.out.println(produto2.codigo);
        System.out.println(produto3.codigo);

    }
}
