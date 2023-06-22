package Cap12.heranca.banco.test;

import Cap12.heranca.banco.domain.ContaInvestimento;
import Cap12.heranca.banco.domain.Titular;

public class ContaTest2 {
    public static void main(String[] args) {
        ContaInvestimento contaInvestimento = new ContaInvestimento();

        contaInvestimento.setTitular(new Titular("Gabriela Barbosa", "121-234-322-12"));
        contaInvestimento.setAgencia(2233);
        contaInvestimento.setNumero(433234);

        contaInvestimento.imprimirDemonstrativo();
        System.out.println("-------");
        contaInvestimento.depositar(100);
        contaInvestimento.imprimirDemonstrativo();
        System.out.println("------");
        contaInvestimento.creditarRendimentos(6);
        contaInvestimento.imprimirDemonstrativo();
    }
}
