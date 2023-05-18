package Cap5.composicaoObjetos.domain;

public class Produto {

    public static double custoEmbalagem;
    public double precoCusto;
    public double precoVenda;

    public void alterarPrecoCusto(double precoCusto){
       this.precoCusto = precoCusto;
    }

    public void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem: %.2f%n", Produto.custoEmbalagem);
    }


}
