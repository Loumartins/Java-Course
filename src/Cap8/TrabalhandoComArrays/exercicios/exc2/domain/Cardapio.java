package Cap8.TrabalhandoComArrays.exercicios.exc2.domain;

import java.util.Arrays;

public class Cardapio {
    ItemCardapio[] itens = new ItemCardapio[0];

    public void adicionarItem(ItemCardapio item){
        this.itens = Arrays.copyOf(this.itens, itens.length+1);
        this.itens[itens.length - 1] = item;

    }

    public void removerItem(int indice){
       ItemCardapio[] itensNovo = new ItemCardapio[itens.length- 1];
       System.arraycopy(itens, 0, itensNovo, 0, indice);
    }

    public void imprimirItensCardapio(double precoMinimo, double precoMaximo){
        /*
         TODO implementar codigo para imprimir no console os itens do cardapio que
              estiverem entre o preço minimo e o preço máximo.
       */
    }
}
