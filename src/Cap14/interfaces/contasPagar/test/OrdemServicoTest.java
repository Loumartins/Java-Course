package Cap14.interfaces.contasPagar.test;

import Cap14.interfaces.contasPagar.domain.Beneficiario;
import Cap14.interfaces.contasPagar.domain.ServicoContaPagar;
import Cap14.interfaces.contasPagar.domain.modelo.OrdemServico;

public class OrdemServicoTest {
    public static void main(String[] args) {
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario fornecedor = new Beneficiario("Code Consultoria", "323.2323.5455.56", "3453-6");

        OrdemServico os = new OrdemServico(fornecedor,65_000);

        servicoContaPagar.pagar(os);
    }
}
