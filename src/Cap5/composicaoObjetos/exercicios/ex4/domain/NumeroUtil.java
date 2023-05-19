package Cap5.composicaoObjetos.exercicios.ex4.domain;

public class NumeroUtil {
    public static String descobrirMaiorNumeroInteiro(int n1, int n2){
        String resposta = "";
        if (n1 > n2 ){
            resposta = "N1 é maior que N2";
           return resposta;
        } else
            resposta = "N2 é maior que N1";
        return resposta;
    }
    public static String descobrirMaiorNumeroInteiro(int n1, int n2, int n3){
        String resposta = "";
        if (n1 > n2 && n1 > n3){

            resposta = "N1 é o maior numero";
            return resposta;
        } else if (n2 > n1 && n2 > n3){
            resposta = "N2 é maior";
            return resposta;
        } else
            resposta = "N3 é maior";
            return resposta;
    }
    public static double descobrirMaiorNumeroFlutuante(double n1, double n2){
        if (n1 > n2){
            return n1;
        } else
            return n2;
    }
    public static double descobrirMaiorNumeroFlutuante(double n1, double n2, double n3){
        if (n1 > n2 && n1 > n3){
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else
            return n3;
    }
}
