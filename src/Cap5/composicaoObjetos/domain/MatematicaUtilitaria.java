package Cap5.composicaoObjetos.domain;

public class MatematicaUtilitaria {

    public static double calcularAcrescimo(double valor, double percentual){
        return valor * ((percentual / 100) + 1);
    }
}
