package Cap25.LambdasExpressions.domain;

public class ServicoInativacaoProduto {

    public static void inativar(Produto produto) {
        System.out.println("Inativando produto: " + produto.getNome());
        produto.inativar();
    }
}
