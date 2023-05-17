package Cap5.composicaoObjetos.domain;

public class ServicoDePrecificacao {
    public void definirPrecoVenda(Produto produto, double percentualMargemLucro){
       produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
    }
}
