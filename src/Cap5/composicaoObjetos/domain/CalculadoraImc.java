package Cap5.composicaoObjetos.domain;

public class CalculadoraImc {


    public IndiceMassaCorporal calcular(double peso, double altura){

        double imcCalculado = peso / (altura * altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.peso = peso;
        imc.altura = altura;
        imc.resultado = imcCalculado;
        return imc;
    }



}
