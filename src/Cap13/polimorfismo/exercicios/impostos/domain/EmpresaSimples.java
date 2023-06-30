package Cap13.polimorfismo.exercicios.impostos.domain;

public class EmpresaSimples extends PessoaJuridica {
    public final double ALIQUOTA_IMPOSTO_FATURAMENTO = 0.06;

    public EmpresaSimples(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }


    @Override
    public double calcularImposto() {
       double impostosCalculados = getFaturamentoAnual() * ALIQUOTA_IMPOSTO_FATURAMENTO;
       return impostosCalculados;
    }
}
