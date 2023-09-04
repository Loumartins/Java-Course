package Cap17.generics.exercicio.main;

import Cap17.generics.exercicio.domain.Carro;
import Cap17.generics.exercicio.domain.GerenciadorEstoque;
import Cap17.generics.exercicio.domain.Imprimir;
import Cap17.generics.exercicio.domain.Roupa;

public class Principal {
    public static void main(String[] args) {
        GerenciadorEstoque<Roupa> estoqueDeRoupas = new GerenciadorEstoque<>();
        estoqueDeRoupas.adicionar(new Roupa("Camiseta básica preta", 5));
        estoqueDeRoupas.adicionar(new Roupa("Camisa basica branca", 4));

        Imprimir.imprimirEstoque(estoqueDeRoupas);

        GerenciadorEstoque<Carro> estoqueDeCarros = new GerenciadorEstoque<>();
        estoqueDeCarros.adicionar(new Carro("BMW", 3));
        estoqueDeCarros.adicionar(new Carro("Mercedes", 3));

        Imprimir.imprimirEstoque(estoqueDeCarros);

    }

}
