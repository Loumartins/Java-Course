package Cap8.TrabalhandoComArrays.exercicios.exc2.test;

import Cap8.TrabalhandoComArrays.exercicios.exc2.domain.Cardapio;
import Cap8.TrabalhandoComArrays.exercicios.exc2.domain.ItemCardapio;

public class CardapioTest {
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        ItemCardapio item1 = new ItemCardapio();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;

        ItemCardapio item2 = new ItemCardapio();
        item2.descricao = "Picanha 400g";
        item2.preco = 102.50;

        ItemCardapio item3 = new ItemCardapio();
        item3.descricao = "Batata Frita";
        item3.preco = 12;

        cardapio.adicionarItem(item1);
        cardapio.adicionarItem(item2);
        cardapio.adicionarItem(item3);

        cardapio.imprimirItensCardapio(80, 150);


    }
}
