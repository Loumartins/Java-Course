package Cap14.interfaces.contasPagar.domain;

import Cap14.interfaces.contasPagar.domain.interfaces.DocumentoPagavel;
import Cap14.interfaces.contasPagar.domain.interfaces.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento){

        metodoPagamento.pagar(documento);
    }
}
