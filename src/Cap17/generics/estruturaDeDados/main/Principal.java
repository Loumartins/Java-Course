package Cap17.generics.estruturaDeDados.main;

import Cap17.generics.estruturaDeDados.domain.Colecao;
import Cap17.generics.estruturaDeDados.domain.Fila;
import Cap17.generics.estruturaDeDados.domain.Pilha;
import Cap17.generics.estruturaDeDados.domain.ColecaoVaziaException;
import Cap17.generics.estruturaDeDados.domain.loja.Produto;

public class Principal {
    public static void main(String[] args) {
        Colecao <Produto> produtos = new Fila<>();

        produtos.colocar(new Produto("Feijao"));
        produtos.colocar(new Produto("Arroz"));
        produtos.colocar(new Produto("Agua de coco"));

        retirarTodos(produtos);

        Colecao<String> nomes = new Pilha<>();
        nomes.colocar("jose");
        nomes.colocar("maria");

        retirarTodos(nomes);

    }

    private static void retirarTodos (Colecao<?> objetos){
        try{
            int i = 1;
            while (true){
                Object object = objetos.retirar();
                System.out.printf("%d. %s%n", i, object.toString());
                i++;
            }
        } catch (ColecaoVaziaException e ){
            System.out.println("Coleção de objetos esgotada");
        }
    }
}
