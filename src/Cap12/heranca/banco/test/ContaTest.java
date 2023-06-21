package Cap12.heranca.banco.test;

import Cap12.heranca.banco.domain.Conta;
import Cap12.heranca.banco.domain.Titular;

public class ContaTest {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Joao da Silva", "12345678901"));
        conta1.setAgencia(1243);
        conta1.setAgencia(9999);
    }
}
