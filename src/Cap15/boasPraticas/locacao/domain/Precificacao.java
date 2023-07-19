package Cap15.boasPraticas.locacao.domain;

public interface Precificacao {

    double calcularValorTotal(Notebook notebook, int horasUtilizadas);
}
