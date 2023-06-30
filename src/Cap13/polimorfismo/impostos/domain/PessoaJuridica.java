package Cap13.polimorfismo.impostos.domain;

public abstract class PessoaJuridica extends Pessoa{
    private double faturamentoAnual;
    private double despesaAnual;

    public PessoaJuridica(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome);
        this.faturamentoAnual = faturamentoAnual;
        this.despesaAnual = despesaAnual;
    }

    public void setFaturamentoAnual(double faturamentoAnual) {
        this.faturamentoAnual = faturamentoAnual;
    }

    public void setDespesaAnual(double despesaAnual) {
        this.despesaAnual = despesaAnual;
    }

    public double getLucro() {
        return faturamentoAnual - despesaAnual;
    }
}
