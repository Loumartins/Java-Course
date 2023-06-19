package Cap11.encapsulamento.domain;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){

        if (cartao.getSaldo() < valor){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }
        cartao.setSaldo(cartao.getSaldo() - valor);

        // TODO realiza outras logicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
