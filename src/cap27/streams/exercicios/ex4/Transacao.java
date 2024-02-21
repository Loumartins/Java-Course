package cap27.streams.exercicios.ex4;

import java.math.BigDecimal;

public class Transacao {
    private Comprador comprador;
    private Vendedor vendedor;
    private BigDecimal valor;


    public Transacao(Comprador comprador, Vendedor vendedor, BigDecimal valor) {
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.valor = valor;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "comprador=" + comprador +
                ", vendedor=" + vendedor +
                ", valor=" + valor +
                '}';
    }
}
