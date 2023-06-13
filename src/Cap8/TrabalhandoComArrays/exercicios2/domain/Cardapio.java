package Cap8.TrabalhandoComArrays.exercicios2.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Cardapio {

 public ArrayList<ItemCardapio> itens = new ArrayList<>();
   public void adicionarItem(ItemCardapio item) {

       itens.add(item);
    }
  public  void removerItem(int indice) {
       itens.remove(indice);
    }
  public  void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }
}
