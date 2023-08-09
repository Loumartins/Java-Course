package Cap16.exceptions.estoque.domain;

import java.util.Objects;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        Objects.requireNonNull(nome, "O nome precisa ser informado");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isAtivo(){
        return ativo;
    }
    public boolean isInativo(){
        return !isAtivo();
    }

    public void ativar(){
        this.ativo = true;
    }
    public void desativar(){
        this.ativo = false;
    }

    public void retirarEstoque(int quantidade){
        if (quantidade < 0){
            throw new IllegalArgumentException("Quantidade deve ser maior que 0");
        }

        if (isInativo()) {
            throw new IllegalStateException("O produto necessita estar ativo para que possar ter uma retirada no estoque");
        }

        if (this.quantidadeEstoque - quantidade < 0){
            throw new IllegalArgumentException("Quantidade inválida, porque estoque ficaria negativo");
        }

        this.quantidadeEstoque-=quantidade;
    }
    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque+=quantidade;
    }
}
