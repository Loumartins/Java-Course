package Cap5.composicaoObjetos.domain;

public class Paciente {
    public double peso;
    public  double altura;

    public IndiceMassaCorporal calcularMassaIndiceCorporal(){

        double imcCalculado = peso / (altura * altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.peso = this.peso;
        imc.altura = this.altura;
        imc.resultado = imcCalculado;
        return imc;
    }

}
