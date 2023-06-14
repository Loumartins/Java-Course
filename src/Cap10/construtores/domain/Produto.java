package Cap10.construtores.domain;

import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_INICIAL_PADRAO = 100;
    public final String codigo;

    public int quantidadeEstoque;
    public String nome;

    public Produto() {
        this("Sem nome");
    }

    public Produto(String nome) {
        this(nome, QUANTIDADE_INICIAL_PADRAO);
    }

    public Produto(String nome, int quantidadeEstoque) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if (quantidadeEstoque < 0){
            throw new IllegalArgumentException("Estoque inicial nao pode ser negativo");
        }
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.codigo = UUID.randomUUID().toString();
    }


}
