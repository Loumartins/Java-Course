package Cap8.TrabalhandoComArrays.exercicios2.domain;

public class ItemCardapio {
    public String descricao;
    public double preco;
   public boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
        return preco >= precoMinimo && preco <= precoMaximo;
    }
   public void imprimir() {
        System.out.printf("%s x R$%.2f%n", descricao, preco);
    }

}
