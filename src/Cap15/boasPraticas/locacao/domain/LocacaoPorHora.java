package Cap15.boasPraticas.locacao.domain;

public class LocacaoPorHora extends Locacao{

    public LocacaoPorHora(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        return getNotebook().getPrecoHora() * horasUtilizadas;
    }
}
