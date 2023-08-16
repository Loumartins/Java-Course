package Cap16.exceptions.estoque.main;

import Cap16.exceptions.estoque.domain.Produto;
import Cap16.exceptions.estoque.domain.ProdutoInativoException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");

        produto.adicionarEstoque(20);
        //produto.ativar();
        comprar(produto);

    }
    private static void comprar(Produto produto){
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.println("Quantidade: ");
                int quantidade = sc.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra realizada com sucesso");
                break;
            } catch (IllegalArgumentException iae){
                System.out.println("Erro");
            } catch (ProdutoInativoException pie){
                System.out.println("Erro na compra: " + pie.getMessage());
                System.out.print("Deseja ativar o produto?");
                if (sc.nextBoolean()){
                    produto.ativar();
                }else {
                    System.out.println("Compra não pode ser realizada");
                    break;
                }

            }

        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade){
        try{
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                    quantidade, produto.getQuantidadeEstoque());
        }catch (IllegalArgumentException iae){
            System.out.println("Erro ao efetuar baixa no estoque: " + iae.getMessage());
            throw iae;
        }
    }
}
