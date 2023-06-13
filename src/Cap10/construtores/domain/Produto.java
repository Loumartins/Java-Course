package Cap10.construtores.domain;

public class Produto {
   static final int QUANTIDADE_INICIAL_PADRAO = 100;
    public int quantidadeEstoque;
    public String nome;

    //sobrecarga de construtor
    public Produto() {
    }
    public Produto(String nome) {
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_INICIAL_PADRAO;
    }
    public Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
//        System.out.println("Construindo um produto");
    }


}
