package Cap8.TrabalhandoComArrays.exercicios2.test;

import Cap8.TrabalhandoComArrays.exercicios2.domain.Cardapio;
import Cap8.TrabalhandoComArrays.exercicios2.domain.ItemCardapio;

public class CardapioTest {
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();

        ItemCardapio itemCardapio1 = new ItemCardapio();

        itemCardapio1.descricao = "Fries";
        itemCardapio1.preco = 35;

        cardapio.adicionarItem(itemCardapio1);

        cardapio.imprimirItensCardapio(35,120);

    }
}
