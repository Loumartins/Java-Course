package Cap8.TrabalhandoComArrays.aula10.domain;

public class ServicoCobranca {
    public void pagar(Fatura fatura,String emailsCobranca,  String... emailsAdicionais){
        //implementando pelo menos um endereço de cobrança



//        if (emailsAdicionais.length == 0){
//            throw new IllegalArgumentException("Informe no minimo um email de cobrança");
//        }

        enviarNotificacao(fatura, emailsCobranca);


        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
                fatura.numero, fatura.valorTotal);

        for (String email: emailsAdicionais){
           enviarNotificacao(fatura, email);
        }
    }

    private void enviarNotificacao(Fatura fatura, String email){
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }
}
