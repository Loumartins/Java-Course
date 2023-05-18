package Cap5.composicaoObjetos.domain;

public class CadastroPortaria {

    public static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

    public void cadastrar(final Visitante visitante){
        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }


    public void cadastrar(final Visitante visitante, int tempoExpiracaoEmMeses){

        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias %n", visitante.nome, tempoExpiracaoEmDias);

    }
}

