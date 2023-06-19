package Cap11.encapsulamento.domain.cartao;

public class ServicoDeDepositoPix {

    public Recibo efeturarDeposito(Cartao cartao, double valorDeposito){
        // TODO faz cobrança do valor no pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Deposito", valorDeposito);
    }
}
