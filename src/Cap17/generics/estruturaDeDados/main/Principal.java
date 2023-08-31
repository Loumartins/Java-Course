package Cap17.generics.estruturaDeDados.main;

import Cap17.generics.estruturaDeDados.domain.Pilha;
import Cap17.generics.estruturaDeDados.domain.ColecaoVaziaException;
import Cap17.generics.estruturaDeDados.domain.loja.Produto;

public class Principal {
    public static void main(String[] args) {
        Pilha <Produto> pilha = new Pilha<>();
//        pilha.colocar("A");
//        pilha.colocar("B");
        pilha.colocar(new Produto("Feijao"));
        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("Agua de coco"));

        retirarTodos(pilha);

    }

    private static void retirarTodos (Pilha<Produto> produtos){
        try{
            int i = 1;
            while (true){
                Produto produto = produtos.retirar();
                System.out.printf("%d. %s%n", i, produto.getDescricao());
                i++;
            }
        } catch (ColecaoVaziaException e ){
            System.out.println("Coleção de produtos esgotada");
        }
    }
}
