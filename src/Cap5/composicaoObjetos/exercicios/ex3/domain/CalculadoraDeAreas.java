package Cap5.composicaoObjetos.exercicios.ex3.domain;

public class CalculadoraDeAreas {

    public final static double PI = 3.14159265358979323846;
    public static int areaQuadrado(int lado){
        return (lado * lado);
    }

    public static double areaCirculo(double raio){
        return (raio * raio) * PI;
    }
}
