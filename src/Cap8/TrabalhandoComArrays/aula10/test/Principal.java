package Cap8.TrabalhandoComArrays.aula10.test;

import Cap8.TrabalhandoComArrays.aula10.domain.Fatura;
import Cap8.TrabalhandoComArrays.aula10.domain.ServicoCobranca;

public class Principal {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();

        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoCobranca servicoCobranca = new ServicoCobranca();

//        String[] emailsCobranca = {"joao@algaworks.com", "maria@algaworks.com"};
//
//        servicoCobranca.pagar(fatura, emailsCobranca);

        //utlizando varags
        //servicoCobranca.pagar(fatura, "joao@algaworks.com", "maria@algaworks.com");

        //passando apenas um parametro
        servicoCobranca.pagar(fatura, "joao@algaworks.com");


    }
}
