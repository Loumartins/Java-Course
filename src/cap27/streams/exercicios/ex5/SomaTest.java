package cap27.streams.exercicios.ex5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SomaTest {
    /*
    Crie um programa que realiza a soma de todos os elementos
    de uma lista utilizando streams paralelos para melhorar o desempenho.
     */

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int somaParalela = Arrays.stream(numeros).parallel().sum();

        System.out.println(somaParalela);


    }
}
