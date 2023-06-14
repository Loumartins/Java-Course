package Cap10.construtores.domain;

public class CalculadoraArea {
    public static final double PI = 3.141592;

    public static double calcularAreaQuadrado(double medidaLado){
        return medidaLado * medidaLado;
    }
    public static double calcularAreaCirculo(double raio){
        return raio * raio * CalculadoraArea.PI;
    }

}
