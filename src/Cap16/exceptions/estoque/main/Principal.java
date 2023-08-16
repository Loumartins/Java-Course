package Cap16.exceptions.estoque.main;

import Cap16.exceptions.estoque.domain.Produto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");

        produto.adicionarEstoque(20);
        produto.ativar();
        comprar(produto);

    }
    private static void comprar(Produto produto){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();

        efetuarBaixaEstoque(produto, quantidade);
        System.out.println("Compra realizada com sucesso");
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade){
        try{
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                    quantidade, produto.getQuantidadeEstoque());
        }catch (IllegalArgumentException iae){
            System.out.println("Erro ao efetuar baixa no estoque: " + iae.getMessage());
        }
    }
}
