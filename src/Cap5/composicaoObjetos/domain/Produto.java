package Cap5.composicaoObjetos.domain;

public class Produto {

    public static double custoEmbalagem;
    public double precoCusto;
    public double precoVenda;

    public static double calcularCustoTotal(Produto produto){
        return produto.precoCusto + Produto.custoEmbalagem;
    }

    public void alterarPrecoCusto(double precoCusto){
       this.precoCusto = precoCusto;
    }

    public static void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem: %.2f%n", Produto.custoEmbalagem);
    }
    public static void alterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem = custoEmbalagem;
    }

}
