package Cap18.Collections.exercicio.agencia.domain;

import Cap18.Collections.exercicio.agencia.exceptions.PacoteDeViagemJaExistenteException;

import java.util.*;

public class CadastroPacoteViagem {

    private List<PacoteViagem> pacoteViagemList = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria){
        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);
        if (pacoteViagemList.equals(pacoteViagem)){
            throw new PacoteDeViagemJaExistenteException("Pacote de viagem ja existente");
        }
        pacoteViagemList.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        return pacoteViagemList;
    }

    public void ordenar(){
        Collections.sort(pacoteViagemList);
    }

    public void ordenarPorPreco(){
        pacoteViagemList.sort(new PacoteDeViagemPorPrecoComparator().reversed());
    }

    public void removerPorDescricao(String descricao){
        ListIterator<PacoteViagem> pacoteViagemListIterator = pacoteViagemList.listIterator();
        for (PacoteViagem pacoteViagem : pacoteViagemList) {
            if (pacoteViagem.getDescricao().equals(descricao)){
                pacoteViagemListIterator.remove();
            }
            throw new IllegalArgumentException("Nenhum pacote de viagens foi removido");
        }

    }

}
