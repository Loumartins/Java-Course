package Cap16.exceptions.estoque.main;

import Cap16.exceptions.estoque.domain.Produto;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");

        produto.adicionarEstoque(10);

        produto.retirarEstoque(5);

        produto.isInativo();

        System.out.printf("Estoque: %d%n", produto.getQuantidadeEstoque());

    }
}
