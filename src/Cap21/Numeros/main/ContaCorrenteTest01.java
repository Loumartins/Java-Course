package Cap21.Numeros.main;

import Cap21.Numeros.domain.ContaCorrente;

import java.math.BigDecimal;

public class ContaCorrenteTest01 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        BigDecimal valor = new BigDecimal("1.0");

        contaCorrente.depositar(valor);

        System.out.println(contaCorrente.getValor());

        contaCorrente.sacar(new BigDecimal("0.10"));
        contaCorrente.sacar(new BigDecimal("0.20"));
        contaCorrente.sacar(new BigDecimal("0.30"));
        contaCorrente.sacar(new BigDecimal("0.40"));

        System.out.println(contaCorrente.getValor());

    }
}
