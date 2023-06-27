package Cap12.heranca.banco.test;

import Cap12.heranca.banco.domain.Conta;
import Cap12.heranca.banco.domain.Titular;

import java.util.Locale;

public class ContaTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Conta conta1 = new Conta(new Titular("Joao da Silva", "12345678901"), 1234, 9999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        System.out.println("---------");

        conta1.imprimirDemonstrativo();

        conta1.sacar(27.50);

        System.out.println("-----");

        conta1.imprimirDemonstrativo();

        System.out.println(conta1);

    }
}
