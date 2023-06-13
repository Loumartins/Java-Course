package Cap10.construtores.domain;

public class Produto {
    static final int QUANTIDADE_INICIAL_PADRAO = 100;
    public int quantidadeEstoque;
    public String nome;


    public Produto(String nome) {
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_INICIAL_PADRAO;

//        System.out.println("Construindo um produto");
    }
}
