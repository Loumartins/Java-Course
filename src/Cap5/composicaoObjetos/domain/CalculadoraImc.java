package Cap5.composicaoObjetos.domain;

public class CalculadoraImc {


    public IndiceMassaCorporal calcular(Paciente paciente){

        double imcCalculado = paciente.peso / (paciente.altura * paciente.altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;
        imc.resultado = imcCalculado;
        return imc;
    }



}
