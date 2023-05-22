package Cap6.codigoLimpo.aula4.domain;

public class Contribuinte {

    // Confome Lei XYZ
    public static final int IDADE_MINIMA_APOSENTADORIA = 65;
    int idade;
    int tempoContribuicaoEmAnos;

    public boolean estaElegivelParaAposentadoria() {
        return this.idade >= IDADE_MINIMA_APOSENTADORIA;
    }
}
