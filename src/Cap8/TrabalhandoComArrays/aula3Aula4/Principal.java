package Cap8.TrabalhandoComArrays.aula3Aula4;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        Integer[]notas = {8,5,4,9,10,};

//        double media = Calculadora.calcularMedia(notas);
//
//        System.out.println(media);


        Arrays.sort(notas, Comparator.reverseOrder());
        System.out.println(Arrays.toString(notas));


    }
}
