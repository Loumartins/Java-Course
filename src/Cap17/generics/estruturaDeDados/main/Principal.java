package Cap17.generics.estruturaDeDados.main;

import Cap17.generics.estruturaDeDados.domain.Pilha;
import Cap17.generics.estruturaDeDados.domain.loja.Produto;

public class Principal {
    public static void main(String[] args) {
        Pilha <Produto> pilha = new Pilha<>();
//        pilha.colocar("A");
//        pilha.colocar("B");
        pilha.colocar(new Produto("Feijao"));
        pilha.colocar(new Produto("Arroz"));

        Produto produto = pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = pilha.retirar();
        System.out.println(produto.getDescricao());


    }
}
