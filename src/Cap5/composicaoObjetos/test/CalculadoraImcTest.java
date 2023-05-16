package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.IndiceMassaCorporal;
import Cap5.composicaoObjetos.domain.CalculadoraImc;

public class CalculadoraImcTest {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        calculadoraImc.altura = 1.82;
        calculadoraImc.peso = 75;

        IndiceMassaCorporal imc = calculadoraImc.calcular();

        System.out.printf("IMC: %.2f%n", imc.resultado);

        imc.estaComObesidade();
    }
}
