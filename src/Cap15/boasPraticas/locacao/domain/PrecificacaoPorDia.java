package Cap15.boasPraticas.locacao.domain;

public class PrecificacaoPorDia implements Precificacao{
    @Override
    public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return notebook.getPrecoDia() * dias;
    }
}
