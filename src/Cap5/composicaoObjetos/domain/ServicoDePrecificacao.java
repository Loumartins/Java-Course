package Cap5.composicaoObjetos.domain;

public class ServicoDePrecificacao {
    public void calcularPrecoVenda(double precoCusto){
        // adiciona 20% margem de lucro
        precoCusto = precoCusto * 1.20;
        System.out.println(precoCusto);
    }
}
