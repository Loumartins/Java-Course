package Cap15.boasPraticas.locacao.test;

import Cap15.boasPraticas.locacao.domain.*;

public class Principal {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Macbook Pro i7 16gb", 5, 100);

        Seguro seguro = new SeguroSantander();
        Precificacao precificacao = new PrecificacaoPorDia();
//
        Locacao locacao = new Locacao(notebook, precificacao, seguro);

        double valorDevido = locacao.calcularValorDevido(10);
        System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);

    }
}
