package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.IndiceMassaCorporal;
import Cap5.composicaoObjetos.domain.CalculadoraImc;
import Cap5.composicaoObjetos.domain.Paciente;


public class CalculadoraImcTest {
    public static void main(String[] args) {

        CalculadoraImc calculadoraImc = new CalculadoraImc();
        Paciente joao = new Paciente();
         joao.altura = 1.82;
         joao.peso = 75;

        IndiceMassaCorporal imc = calculadoraImc.calcular(joao);

        System.out.printf("IMC: %.2f%n", imc.resultado);

        imc.estaComObesidade();
    }
}
