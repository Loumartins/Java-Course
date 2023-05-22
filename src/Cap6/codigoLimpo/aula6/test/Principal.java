package Cap6.codigoLimpo.aula6.test;

import Cap6.codigoLimpo.aula6.domain.CarrinhoDeCompras;
import Cap6.codigoLimpo.aula6.domain.Produto;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

     //   carrinhoDeCompras.adicionarItem("Água", 5, 4);

        Produto produto = new Produto();
        produto.nome = "Agua";
        produto.precoUnitario = 5;

        carrinhoDeCompras.adicionarItem(produto, 4);
    }
}
