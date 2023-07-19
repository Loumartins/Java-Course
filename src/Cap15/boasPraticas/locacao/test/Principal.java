package Cap15.boasPraticas.locacao.test;

import Cap15.boasPraticas.locacao.domain.Locacao;
import Cap15.boasPraticas.locacao.domain.LocacaoPorHora;
import Cap15.boasPraticas.locacao.domain.LocacaoPorHoraSeguroSantander;
import Cap15.boasPraticas.locacao.domain.Notebook;

public class Principal {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Macbook Pro i7 16gb", 5, 100);

        Locacao locacao = new LocacaoPorHoraSeguroSantander(notebook);
        double valorDevido = locacao.calcularValorDevido(10);

        System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);
    }
}
