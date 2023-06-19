package Cap11.encapsulamento.domain;

public class ServicoDeDepositoPix {

    public Recibo efeturarDeposito(Cartao cartao, double valorDeposito){
        // TODO faz cobrança do valor no pix

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw new IllegalArgumentException(String.format
                    ("Valor de deposito nao pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }
        cartao.setSaldo(cartao.getSaldo() + valorDeposito - Cartao.TARIFA_DEPOSITO );
        return new Recibo(cartao.getTitular(), "Deposito", valorDeposito);
    }
}
