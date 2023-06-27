package Cap12.heranca.funcionario.test;

import Cap12.heranca.funcionario.domain.Funcionario;
import Cap12.heranca.funcionario.domain.Holerite;
import Cap12.heranca.funcionario.domain.Programador;

public class FuncionarioTest {
    public static void main(String[] args) {
//        Funcionario funcionario1 = new Funcionario("Joao", 40);
//        // System.out.println(funcionario1);
//        Holerite holerite1 = funcionario1.gerarHolerite(180, "julho/2022");
//        holerite1.imprimir();

        System.out.println("---------");

        Programador programador1 = new Programador("Luiz", 80);
        programador1.setValorBonus(1000);
        System.out.println(programador1);
        programador1.setTemBonus(false);
        Holerite holerite2 = programador1.gerarHolerite(180, "julho/2022");
        holerite2.imprimir();
    }
}
