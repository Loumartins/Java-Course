package Cap15.boasPraticas.locacao.domain;

public class PrecificacaoPorHora implements Precificacao {
    @Override
    public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
        return notebook.getPrecoHora() * horasUtilizadas;
    }
}
