package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.IndiceMassaCorporal;
import Cap5.composicaoObjetos.domain.Paciente;

public class PacienteTest {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.82;
        paciente.peso = 200;

        IndiceMassaCorporal imc = paciente.calcularMassaIndiceCorporal();

        if (imc.resultado >=30){
            System.out.printf("Paciente com altura de: %.2f e de peso: %.2f " +
                    "está com obesidade",paciente.altura, paciente.peso);
        }
        System.out.println();
        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
