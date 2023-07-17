package Cap14.interfaces.empresa.servico;

import Cap14.interfaces.empresa.domain.PessoaBonificavel;

public class ServicoPagamentoBonus {
    public void pagar(PessoaBonificavel pessoaBonificavel, double percentualMetaAlcancada){
        double valor = pessoaBonificavel.calcularBonus(percentualMetaAlcancada);

        System.out.printf("DEBUG: Bônus pago no valor de R$%.2f", valor);

    }
}
