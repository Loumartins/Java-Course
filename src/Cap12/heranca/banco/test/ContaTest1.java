package Cap12.heranca.banco.test;

import Cap12.heranca.banco.domain.ContaEspecial;
import Cap12.heranca.banco.domain.Titular;

public class ContaTest1 {
    public static void main(String[] args) {
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setTitular(new Titular("Luiz Henrique", "234.123.234-45"));
        contaEspecial.setAgencia(1234);
        contaEspecial.setNumero(000121);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.setTarifaMensal(90);

        contaEspecial.imprimirDemonstrativo();
        System.out.println("-------");
        contaEspecial.depositar(100);

        contaEspecial.imprimirDemonstrativo();
        System.out.println("-------");
        contaEspecial.sacar(200);

        contaEspecial.debitarTarifaMensal();
        contaEspecial.imprimirDemonstrativo();
   }
}
