package cap27.streams.exercicios.ex4;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeTransacao {
    private final List<Transacao> transacaoList = new ArrayList<>();

    public void adicionarTransacao (Transacao transacao){

        if (transacaoList.contains(transacao)){
            System.out.println("Transação duplicada não pode ser adicionada");
        }
        transacaoList.add(transacao);
    }


    public List<Transacao> obterTransacao() {
        return transacaoList;
    }
}
