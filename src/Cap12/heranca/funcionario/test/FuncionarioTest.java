package Cap12.heranca.funcionario.test;

import Cap12.heranca.funcionario.domain.Funcionario;
import Cap12.heranca.funcionario.domain.Holerite;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao", 40);
        // System.out.println(funcionario1);
        Holerite holerite1 = funcionario1.gerarHolerite(180, "julho/2022");
        holerite1.imprimir();
    }
}
