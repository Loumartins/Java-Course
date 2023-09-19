package Cap18.Collections.encapsulandoColecoes.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

        private final Cliente cliente;
        private final List<ItemVenda> itens = new ArrayList<>();
        private double valor;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public double getValor() {
        return valor;
    }

    public void adicionarItem(ItemVenda item){
        if (excedeLimiteDeCompra(item)){
            throw new LimiteDeCompraExcedidoException("Limite de compras excedido");
        }
        valor += item.getValor();
        itens.add(item);
    }

    private boolean excedeLimiteDeCompra(ItemVenda item){
        return valor + item.getValor() > getCliente().getLimiteCompras();
    }
}

