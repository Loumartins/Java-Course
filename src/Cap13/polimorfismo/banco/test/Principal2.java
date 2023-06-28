package Cap13.polimorfismo.banco.test;

import Cap13.polimorfismo.banco.domain.*;

public class Principal2 {
    public static void main(String[] args) {
        Titular titular = new Titular("Joao da Silva", "123.233.121-54");
        Conta conta = new ContaSalario(1234, 9999, titular, 18_0000);

    }
}
