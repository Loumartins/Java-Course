package Cap13.polimorfismo.banco.test;

import Cap13.polimorfismo.banco.domain.*;

public class Principal1 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(1234,9999,new Titular("Joao da silva", "123.432.556-65"), 90);
        conta1.setLimiteChequeEspecial(1000);

        //ContaEspecial conta2 = new ContaEspecial(2222, 88888,new Titular("Maria Joana", "232.544.565-65"), 90);

        ContaSalario conta3 = new ContaSalario(2321, 334334,new Titular("Francisco Souza", "232.544.565-65"), 18_000);

//        conta3.depositar(300);
//        // conta1.imprimirDemonstrativo();
//
//        caixaEletronico.transferir(conta1, conta3, 50);
//        conta1.imprimirDemonstrativo();
//        System.out.println("-------");
//        conta3.imprimirDemonstrativo();

        ContaInvestimento conta2 = new ContaInvestimento(1234, 99999, new Titular("Luiz Henrique", "032.343.432-45"));

        conta2.depositar(100);
        conta2.creditarRendimentos(10);

//        caixaEletronico.imprimirDemonstrativo(conta1);

        caixaEletronico.imprimirDemonstrativo(conta2);

    }
}
