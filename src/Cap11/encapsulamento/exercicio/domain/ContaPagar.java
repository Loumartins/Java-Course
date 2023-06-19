package Cap11.encapsulamento.exercicio.domain;

public class ContaPagar {

    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;

    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
//
//    public void pagar(){
//        if (isPago() == true){
//            throw new RuntimeException("Nao é possivel pagar uma conta que ja está paga");
//        }
//
//    }
//    public void cancelarPagamento(){
//        if ()
//    }
}
