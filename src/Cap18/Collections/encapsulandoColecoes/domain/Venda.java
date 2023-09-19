package Cap18.Collections.encapsulandoColecoes.domain;

import java.util.ArrayList;
import java.util.List;

public class Venda {

        private final Cliente cliente;
        private List<ItemVenda> itens = new ArrayList<>();
        private double valor;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public double getValor() {
        return valor;
    }

}

