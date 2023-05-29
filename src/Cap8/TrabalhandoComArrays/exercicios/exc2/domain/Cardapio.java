package Cap8.TrabalhandoComArrays.exercicios.exc2.domain;

import java.util.Arrays;

public class Cardapio {
    ItemCardapio[] itens = new ItemCardapio[0];

    public void adicionarItem(ItemCardapio item){
        this.itens = Arrays.copyOf(this.itens, itens.length+1);
        this.itens[itens.length - 1] = item;
        // TODO implementar inclusão de item do cardápio
    }

    public void removerItem(int indice){
       // TODO implementar exclusao de item do cardapio da posição informada
    }

    public void imprimirItensCardapio(double precoMinimo, double precoMaximo){
        for (ItemCardapio item : itens) {
            if (item.preco >=precoMinimo && item.preco <=precoMaximo){
                System.out.println(item);
            }
        }

        /*
         TODO implementar codigo para imprimir no console os itens do cardapio que
              estiverem entre o preço minimo e o preço máximo.
       */
    }
}
