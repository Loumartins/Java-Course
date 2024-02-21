package cap27.streams.exercicios.ex1;

import java.util.Arrays;
import java.util.List;

public class NumerosTest {
    /*
    Crie um programa Java que utilize uma stream para
    filtrar números pares de uma lista de inteiros.
     */

    public static void main(String[] args) {
        Integer[] numeros = {1,2,4,5,12,6,43,54,56,100};

        List<Integer> numerosLista = Arrays.asList(numeros);

        numerosLista.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);


    }

}
