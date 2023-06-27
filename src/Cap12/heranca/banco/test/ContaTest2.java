package Cap12.heranca.banco.test;

import Cap12.heranca.banco.domain.ContaInvestimento;
import Cap12.heranca.banco.domain.Titular;

public class ContaTest2 {
    public static void main(String[] args) {
        Titular titular = new Titular("Gabriela Barbosa", "121-234-322-12");
        ContaInvestimento contaInvestimento = new ContaInvestimento(titular, 1234, 23212);
        contaInvestimento.imprimirDemonstrativo();
        System.out.println("-------");
        contaInvestimento.depositar(100);
        contaInvestimento.imprimirDemonstrativo();
        System.out.println("------");
        contaInvestimento.creditarRendimentos(6);
        contaInvestimento.imprimirDemonstrativo();
    }
}
