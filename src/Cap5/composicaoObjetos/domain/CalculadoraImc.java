package Cap5.composicaoObjetos.domain;

public class CalculadoraImc {
    public double peso;
    public  double altura;

    public IndiceMassaCorporal calcular(){

        double imcCalculado = peso / (altura * altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.peso = this.peso;
        imc.altura = this.altura;
        imc.resultado = imcCalculado;
        return imc;
    }



}
