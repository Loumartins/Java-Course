package Cap10.construtores.domain;

public class Produto {
    public int quantidadeEstoque;
    public String nome;
    public Produto(int quantidadeEstoque, String nome) {
        this.quantidadeEstoque = quantidadeEstoque;
        this.nome = nome;
        System.out.println("Construindo um produto");
    }
}
