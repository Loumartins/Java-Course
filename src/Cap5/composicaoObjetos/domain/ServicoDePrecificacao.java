package Cap5.composicaoObjetos.domain;

public class ServicoDePrecificacao {
    public void definirPrecoVenda(Produto produto, double percentualMargemLucro){

        double precoVendaCalculado = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
        precoVendaCalculado += Produto.custoEmbalagem;
        produto.precoVenda = precoVendaCalculado;
    }
}
