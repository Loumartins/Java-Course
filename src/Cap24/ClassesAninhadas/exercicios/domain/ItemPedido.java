package Cap24.ClassesAninhadas.exercicios.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class ItemPedido {
    private Pedido pedido;
    private final String descricao;
    private final BigDecimal valorUnitario;
    private int quantidade;

    public ItemPedido(Pedido pedido, String descricao, BigDecimal valorUnitario, int quantidade) {
        Objects.requireNonNull(pedido);
        Objects.requireNonNull(descricao);
        Objects.requireNonNull(valorUnitario);

        if (valorUnitario.compareTo(BigDecimal.ZERO) < 1){
            throw new IllegalArgumentException("Valor unitário deve ser maior do que 0");
        }
        this.pedido = pedido;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        pedido.checarPedidoParaModificacao();

        if(quantidade < 1){
            throw new IllegalArgumentException("Quantidade deve ser maior que 0");
        }
        pedido.valorTotal = pedido.valorTotal.subtract(calcularValorTotal(this.quantidade));
        this.quantidade = quantidade;
        pedido.valorTotal = pedido.valorTotal.add(calcularValorTotal(quantidade));
    }

    public BigDecimal getValorTotal(){
        return calcularValorTotal(this.quantidade);
    }

    private BigDecimal calcularValorTotal(int quantidade){
        return valorUnitario.multiply(new BigDecimal(quantidade));
    }
}
