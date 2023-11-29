package Cap24.ClassesAninhadas.naoEstaticas.test;

import Cap24.ClassesAninhadas.naoEstaticas.domain.ContaCorrente;

import java.math.BigDecimal;

public class ContaCorrenteTest01 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(new BigDecimal("1000"));

        ContaCorrente.Transacao transacao1 = contaCorrente.new Transacao("Compra no mercado", new BigDecimal("188.4"));

        ContaCorrente.Transacao transacao2 = contaCorrente.new Transacao("Pagamento academia", new BigDecimal("100"));

        for (ContaCorrente.Transacao transacao : contaCorrente.getTransacoes()) {
            System.out.printf("%s = %s%n", transacao.getDescricao(), transacao.getValor());
        }
        System.out.println(contaCorrente.getSaldo());
    }
}
 