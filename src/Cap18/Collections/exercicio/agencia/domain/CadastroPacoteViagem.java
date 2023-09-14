package Cap18.Collections.exercicio.agencia.domain;

import Cap18.Collections.exercicio.agencia.exceptions.PacoteDeViagemJaExistenteException;

import java.util.ArrayList;
import java.util.List;

public class CadastroPacoteViagem {

    private List<PacoteViagem> pacoteViagemList = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria){
        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);
        if (pacoteViagemList.equals(pacoteViagem)){
            throw new PacoteDeViagemJaExistenteException("Pacote de viagem ja existente");
        }
        pacoteViagemList.add(pacoteViagem);
    }
}
