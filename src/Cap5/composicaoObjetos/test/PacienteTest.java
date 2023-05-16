package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.IndiceMassaCorporal;
import Cap5.composicaoObjetos.domain.Paciente;

public class PacienteTest {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.82;
        paciente.peso = 75;

        IndiceMassaCorporal imc = paciente.calcularMassaIndiceCorporal();

        System.out.printf("IMC: %.2f%n", imc.resultado);

        imc.estaComObesidade();
    }
}
