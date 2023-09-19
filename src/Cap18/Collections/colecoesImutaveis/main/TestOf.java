package Cap18.Collections.colecoesImutaveis.main;

import java.util.List;

public class TestOf {
    public static void main(String[] args) {
        // Gerando uma nova lista
        List<Integer> numeros = List.of(1,2);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        // * Sempre lembrando que utilizando o metodo estatico List.of a lista tambem é imutavel;


    }
}
