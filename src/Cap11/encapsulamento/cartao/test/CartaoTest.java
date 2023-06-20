package Cap11.encapsulamento.cartao.test;

import Cap11.encapsulamento.cartao.domain.*;

public class CartaoTest {
    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("Joao Souza Silva");

        var servicoDeDeposito = new ServicoDeDepositoPix();

        Recibo reciboDeposito = servicoDeDeposito.efeturarDeposito(cartao, 500);

        var servicoDePagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado, cartao, 200);

        reciboDeposito.imprimir();

        reciboPagamento.imprimir();


        System.out.println(cartao.getSaldo());
    }
}

