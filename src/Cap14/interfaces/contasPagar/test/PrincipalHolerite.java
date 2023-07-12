package Cap14.interfaces.contasPagar.test;

import Cap14.interfaces.contasPagar.domain.Beneficiario;
import Cap14.interfaces.contasPagar.domain.Pix;
import Cap14.interfaces.contasPagar.domain.interfaces.MetodoPagamento;
import Cap14.interfaces.contasPagar.domain.modelo.Holerite;
import Cap14.interfaces.contasPagar.domain.ServicoContaPagar;

public class PrincipalHolerite {
    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = new Pix();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Joao da Silva", "232.323.232-34", "2323-4");

        Holerite documento = new Holerite(funcionario, 100, 168);

        servicoContaPagar.pagar(documento);
    }
}
