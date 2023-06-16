package Cap11.encapsulamento.domain;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){

        if (cartao.saldo < valor){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }
        cartao.saldo -= valor;

        // TODO realiza outras logicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.titular, "Pagamento", valor);
    }
}
