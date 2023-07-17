package Cap14.interfaces.empresa.test;

import Cap14.interfaces.empresa.domain.ClienteFinanciavel;
import Cap14.interfaces.empresa.domain.Funcionario;
import Cap14.interfaces.empresa.domain.PessoaBonificavel;
import Cap14.interfaces.empresa.servico.ServicoPagamentoBonus;
import Cap5.composicaoObjetos.domain.Pessoa;

public class Principal2 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao da Silva", 18_000);


        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario, 20);
    }
}
