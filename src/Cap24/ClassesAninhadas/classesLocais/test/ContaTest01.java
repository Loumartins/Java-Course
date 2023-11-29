package Cap24.ClassesAninhadas.classesLocais.test;

import Cap24.ClassesAninhadas.classesLocais.domain.Conta;
import Cap24.ClassesAninhadas.classesLocais.domain.Transacao;

import java.math.BigDecimal;

public class ContaTest01 {
    public static void main(String[] args) {
        Conta conta = new Conta((new BigDecimal("1000")));
        System.out.println("Saldo inicial: " + conta.getSaldo());

        Transacao transacao1 = conta.efetuarPagamento(new BigDecimal("100"));
        Transacao transacao2 = conta.cobrarTarifa(new BigDecimal("20"));
        System.out.println("Transacao 1: " + transacao1.getValorTotal());
        System.out.println("Transacao 2: " + transacao2.getValorTotal());
        System.out.println("Saldo final: " + conta.getSaldo());

        transacao1.reembolsar();
        transacao2.reembolsar();

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
