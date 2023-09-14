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

    public void removerPorDescricao(String descricao) {
        boolean removido = false;
        Iterator<PacoteViagem> pacoteViagemIterator = pacoteViagemList.iterator();
        while (pacoteViagemIterator.hasNext()){
            PacoteViagem pacoteViagem = pacoteViagemIterator.next();
           if (pacoteViagem.getDescricao().equals(descricao)){
               pacoteViagemIterator.remove();
               removido = true;
           }
        }
        if (!removido){
            throw new IllegalArgumentException("Pacote de viagem não encontrado com descrição");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao){
        for (PacoteViagem pacoteViagem : pacoteViagemList) {
            if (pacoteViagem.getDescricao().equals(descricao)){
                return pacoteViagem;
            }
        }
        throw new IllegalArgumentException("Pacote de viagem não encontrado");
    }

}
