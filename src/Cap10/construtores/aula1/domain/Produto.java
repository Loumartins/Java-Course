package Cap10.construtores.aula1.domain;

public class Produto {
    int quantidadeEstoque;
    public Produto() {
        this.quantidadeEstoque = 10;
        System.out.println("Construindo um produto");
    }
}
