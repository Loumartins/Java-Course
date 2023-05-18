package Cap5.composicaoObjetos.domain;

public class Visitante {

    public static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 18;
    public String nome;
    public int idade;

    public boolean possuiAcessoRestritoPorIdade(){
        return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }
}
