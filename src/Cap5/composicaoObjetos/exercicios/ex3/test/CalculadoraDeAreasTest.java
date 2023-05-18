package Cap5.composicaoObjetos.exercicios.ex3.test;

import Cap5.composicaoObjetos.exercicios.ex3.domain.CalculadoraDeAreas;

public class CalculadoraDeAreasTest {
    public static void main(String[] args) {
        int lado = 5;
        System.out.printf("A área do quadrado é: %d%n", CalculadoraDeAreas.areaQuadrado(5));

        System.out.println("-------------------");

        double raio = 6.25;
        System.out.printf("A área do ciruclo é de: %.2f%n", CalculadoraDeAreas.areaCirculo(raio));
    }


}
