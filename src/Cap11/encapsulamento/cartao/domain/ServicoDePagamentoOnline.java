package Cap11.encapsulamento.cartao.domain;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){


        cartao.debitar(valor);

        // TODO realiza outras logicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
