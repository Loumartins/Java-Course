package Cap15.boasPraticas.locacao.domain;

public class Notebook {

    private String descricao;
    private double precoHora;
    private double precoDia;

    public Notebook(String descricao, double precoHora, double precoDia) {
        this.descricao = descricao;
        this.precoHora = precoHora;
        this.precoDia = precoDia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(double precoDia) {
        this.precoDia = precoDia;
    }
}
