package Cap10.construtores.domain;

import java.util.Objects;

public class Produto {
   static final int QUANTIDADE_INICIAL_PADRAO = 100;
    public int quantidadeEstoque;
    public String nome;

    //sobrecarga de construtor
    public Produto() {
    }
    public Produto(String nome) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_INICIAL_PADRAO;
    }
    public Produto(String nome, int quantidadeEstoque) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        this.nome = nome;

        if (quantidadeEstoque < 0){
            throw new IllegalArgumentException("Estoque inicial nao pode ser negativo");
        }
        this.quantidadeEstoque = quantidadeEstoque;
//        System.out.println("Construindo um produto");
    }


}
