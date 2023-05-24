package Cap8.TrabalhandoComArrays.aula5.exemplo.test;

import Cap8.TrabalhandoComArrays.aula5.exemplo.domain.Pessoa;
import Cap8.TrabalhandoComArrays.aula5.exemplo.domain.Tenis;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Luiz Henrique";
        pessoa1.tamanhoPe = 39;

        pessoa1.tenis = new Tenis[4];
        pessoa1.tenis[0] = new Tenis();
        pessoa1.tenis[0].nome = "Nike Cortez";
        pessoa1.tenis[0].marca = "Nike";

        //outra forma de criar arrays de objetos
        Tenis tenis1 = new Tenis();
        tenis1.marca = "Adidas";
        tenis1.nome = "Adidas Samba";
        pessoa1.tenis[1] = tenis1;


    }
}
