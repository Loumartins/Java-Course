package Cap5.composicaoObjetos.domain;

public class ServicoDePrecificacao {
    public void definirPrecoVenda(Produto produto, double percentualMargemLucro){

        double precoVendaCalculado = MatematicaUtilitaria.calcularAcrescimo(
                produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;
        produto.precoVenda = precoVendaCalculado;
    }
}
