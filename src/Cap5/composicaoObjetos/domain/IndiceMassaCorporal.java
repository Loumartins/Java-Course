package Cap5.composicaoObjetos.domain;

public class IndiceMassaCorporal {
    public double resultado;
    public double peso;
    public double altura;

    public boolean estaComObesidade(){
        String estaObeso = "";
        if (this.resultado >= 30){
            estaObeso = "O paciente esta com obesidade.";
            System.out.println(estaObeso);
            return true;
        } else
            estaObeso = "O paciente nao esta com obesidade";
            System.out.println(estaObeso);
            return false;
    }
    public boolean estaAbaixoDoPesoIdeal(){
        return this.resultado<=18.5;
    }

}
