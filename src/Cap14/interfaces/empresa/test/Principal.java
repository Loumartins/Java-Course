package Cap14.interfaces.empresa.test;

import Cap14.interfaces.empresa.domain.Fazenda;
import Cap14.interfaces.empresa.domain.Industria;
import Cap14.interfaces.empresa.domain.ParceiroFinanceiro;
import Cap14.interfaces.empresa.servico.ServicoFinanciamento;

public class Principal {
    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();

        var fazenda = new Fazenda("Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        var parceiro = new ParceiroFinanceiro("Capital ABC", 2_000_000);
    }
}
