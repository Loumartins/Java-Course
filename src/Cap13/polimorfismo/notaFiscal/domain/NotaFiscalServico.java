package Cap13.polimorfismo.notaFiscal.domain;

public class NotaFiscalServico extends NotaFiscal    {
    private boolean intermunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean intermunicipal) {
        super(descricao, valorTotal);
        this.intermunicipal = intermunicipal;
    }

    public boolean isIntermunicipal() {
        return intermunicipal;
    }

}
