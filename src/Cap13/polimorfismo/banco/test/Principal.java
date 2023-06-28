package Cap13.polimorfismo.banco.test;

import Cap13.polimorfismo.banco.domain.Conta;
import Cap13.polimorfismo.banco.domain.ContaEspecial;
import Cap13.polimorfismo.banco.domain.Titular;

public class Principal {
    public static void main(String[] args) {
        Titular titular = new Titular("Joao da Silva", "123.432.556-43");
        ContaEspecial contaEspecial = new ContaEspecial(1234,9999, titular);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        Conta conta = (Conta) contaEspecial;
    }
}
