package Cap17.generics.exercicio.domain;

public class GerenciadorEstoque < T extends Estocavel> {

    private int quantidadeTotal;
    public void adicionar(T itens){
        quantidadeTotal +=itens.getQuantidadeEstoque();
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }
}
