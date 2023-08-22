package Cap16.exceptions.exercicios.main;

import Cap16.exceptions.exercicios.domain.ContaCorrente;

public class ContaCorrenteTest01 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("123");

        contaCorrente.ativar();

        contaCorrente.depositar(1000);

        System.out.printf("Sado da conta: %.2f%n", contaCorrente.getSaldo());
    }
}
