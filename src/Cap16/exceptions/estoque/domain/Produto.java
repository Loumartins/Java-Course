package Cap16.exceptions.estoque.domain;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
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
        this.quantidadeEstoque-=quantidade;
    }
    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque+=quantidade;
    }
}
