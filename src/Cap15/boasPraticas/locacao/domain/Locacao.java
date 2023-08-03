package Cap15.boasPraticas.locacao.domain;

public class Locacao {
    private Notebook notebook;
    private Precificacao precificacao;
    private Seguro seguro;

    public Locacao(Notebook notebook, Precificacao precificacao) {
        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
        this(notebook, precificacao);
        this.seguro = seguro;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Precificacao getPrecificacao() {
        return precificacao;
    }

    public double calcularValorDevido(int horasUtilizadas){
        double valorTotal = getPrecificacao().calcularValorTotal(getNotebook(), horasUtilizadas);

        return valorTotal;
    }
}
