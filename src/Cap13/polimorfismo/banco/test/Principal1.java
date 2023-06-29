package Cap13.polimorfismo.banco.test;

import Cap13.polimorfismo.banco.domain.CaixaEletronico;
import Cap13.polimorfismo.banco.domain.ContaEspecial;
import Cap13.polimorfismo.banco.domain.ContaSalario;
import Cap13.polimorfismo.banco.domain.Titular;

public class Principal1 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(1234,9999,new Titular("Joao da silva", "123.432.556-65"), 90);
        conta1.setLimiteChequeEspecial(1000);

        ContaEspecial conta2 = new ContaEspecial(2222, 88888,new Titular("Maria Joana", "232.544.565-65"), 90);

        ContaSalario conta3 = new ContaSalario(2321, 334334,new Titular("Francisco Souza", "232.544.565-65"), 18_000);

        conta1.depositar(300);
        // conta1.imprimirDemonstrativo();

        caixaEletronico.transferir(conta1, conta3, 50);
        conta1.imprimirDemonstrativo();
        System.out.println("-------");
        conta3.imprimirDemonstrativo();


    }
}
