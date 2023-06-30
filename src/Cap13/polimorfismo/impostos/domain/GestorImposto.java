package Cap13.polimorfismo.impostos.domain;

public class GestorImposto {
    private double valorTotalImpostos;

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void adicionarPessoas(Pessoa... pessoas){
        for (Pessoa pessoa : pessoas){
            pessoa.calcularImposto();
        }
    }
}
