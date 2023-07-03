package Cap13.polimorfismo.exercicios.impostos.domain;

public class GestorImposto {
    private double valorTotalImpostos;

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void adicionar(Pessoa... pessoas){
        for (Pessoa pessoa : pessoas){
            System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), pessoa.calcularImposto());
            valorTotalImpostos+= pessoa.calcularImposto();
            System.out.println("---------------");
        }
    }
}
