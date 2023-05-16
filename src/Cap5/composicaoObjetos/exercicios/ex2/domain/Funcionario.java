package Cap5.composicaoObjetos.exercicios.ex2.domain;

public class Funcionario {
    public String nome;
    public int qtdFilhos;

    public boolean temFilho(){
        if (qtdFilhos>0){
            return true;
        } return false;
    }
}
