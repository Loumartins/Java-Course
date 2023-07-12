package Cap14.interfaces.contasPagar.domain;

import Cap14.interfaces.contasPagar.domain.interfaces.DocumentoPagavel;
import Cap14.interfaces.contasPagar.domain.interfaces.MetodoPagamento;

public class ServicoContaPagar {

    public void pagar(DocumentoPagavel documento){
        MetodoPagamento metodoPagamento = new Transferencia();

        metodoPagamento.pagar(documento);
    }
}
