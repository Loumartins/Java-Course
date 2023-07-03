package Cap14.interfaces.contasPagar.domain;

import Cap14.interfaces.contasPagar.domain.interfaces.DocumentoPagavel;

public class ServicoContaPagar {

    public void pagar(DocumentoPagavel documento){
        Beneficiario beneficiario =  documento.getBeneficiario();

        if (beneficiario.naoPossuiChavePix()){
            throw new RuntimeException("Beneficiario nao possui chave Pix");
        }
        System.out.printf("DEBUG: Efetuando PIX para %s no valor de %.2f com a chave %s%n", beneficiario.getNome(),documento.getValorTotal(), beneficiario.getChavePix());
    }
}
