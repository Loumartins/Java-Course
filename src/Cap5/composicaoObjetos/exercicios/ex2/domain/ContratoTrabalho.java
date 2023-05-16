package Cap5.composicaoObjetos.exercicios.ex2.domain;

public class ContratoTrabalho {
    public Funcionario funcionario;
    public double valorNormal;
    public double valorExtra;

    public boolean contratoAdicional(){
        if (funcionario.temFilho()){
            return true;
        } else
            return false;
    }

}
