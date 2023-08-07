package Cap15.boasPraticas.banco.loubank;

import Cap15.boasPraticas.banco.javabank.Conta;
import Cap15.boasPraticas.banco.javabank.ContaCorrente;

public class Principal {
    public static void main(String[] args) {
       AuditoriaDecorator conta1 = new AuditoriaDecorator(new ContaCorrente());

        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.imprimirSaldo();

        System.out.printf("Saldo da conta 1: R$%.2f%n", conta1.getSaldo() );
//        System.out.printf("Saldo da conta 2: R$%.2f%n", conta2.getSaldo() );
//        System.out.printf("Pontos da conta 1: %d%n", pontuacao.getPontos());
        System.out.printf("Operações: %d%n", conta1.getQuantidadeDeOperacoes());
    }
}
