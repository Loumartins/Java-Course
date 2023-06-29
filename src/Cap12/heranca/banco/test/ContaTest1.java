package Cap12.heranca.banco.test;

import Cap12.heranca.banco.domain.ContaEspecial;
import Cap12.heranca.banco.domain.Titular;

public class ContaTest1 {
    public static void main(String[] args) {
        Titular titular = new Titular("Luiz Henrique", "234.123.234-45");
        ContaEspecial contaEspecial = new ContaEspecial(titular,1234, 99999,90.0);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.setTarifaMensal(90);

//        contaEspecial.imprimirDemonstrativo();
//        System.out.println("-------");
//        contaEspecial.depositar(100);
//
//        contaEspecial.imprimirDemonstrativo();
//        System.out.println("-------");
        contaEspecial.sacar(200);

        contaEspecial.debitarTarifaMensal();
       contaEspecial.imprimirDemonstrativo();
   }
}
