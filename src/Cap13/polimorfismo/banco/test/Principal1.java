package Cap13.polimorfismo.banco.test;

import Cap13.polimorfismo.banco.domain.Conta;
import Cap13.polimorfismo.banco.domain.ContaEspecial;
import Cap13.polimorfismo.banco.domain.Titular;

public class Principal1 {
    public static void main(String[] args) {

       ContaEspecial conta1 = new ContaEspecial(1234,9999, new Titular("Joao da silva", "123.454.212-45"));
       conta1.setLimiteChequeEspecial(1000);
       ContaEspecial conta2 = new ContaEspecial(2322,34343,new Titular("Maria Joana", "978.433.556-76"));
       conta2.depositar(300);
    }
}
