package Cap18.Collections.encapsulandoColecoes.domain;

import java.util.Objects;

public class ItemVenda {
    private final String descricao;
    private final double valor;

    public ItemVenda(String descricao, double valor) {
        Objects.requireNonNull(descricao);
        this.descricao = descricao;
        if (valor < 0){
            throw new IllegalArgumentException("O valor do item deve ser positivo");
        }
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
