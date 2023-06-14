package Cap10.construtores.test;

import Cap10.construtores.domain.CalculadoraArea;

import static Cap10.construtores.domain.CalculadoraArea.*;

public class CalculadoraAreaTest {
    public static void main(String[] args) {
        double areaQuadrado = calcularAreaQuadrado(5.2);
        double areaCirculo = calcularAreaCirculo(10.5);
        System.out.printf("PI:%.2f%n", PI);
        System.out.printf("Area do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Area do quadrado: %.2f%n", areaCirculo);
    }
}
