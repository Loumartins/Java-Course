package cap27.streams.exercicios.ex6;

import java.util.Arrays;
import java.util.List;

public class ImparTest {

    /*
    Crie um programa Java que utilize uma stream para filtrar os números ímpares de uma lista de inteiros.
     */

    public static void main(String[] args) {
        Integer[] numeros = {2,4,6,23,43,21,56,75,345,5654,34,21,435,564,34};

        List<Integer> numerosList = Arrays.asList(numeros);

        numerosList.stream()
                .filter(n-> n % 2 != 0)
                .distinct()
                .forEach(System.out::println);
    }
}
