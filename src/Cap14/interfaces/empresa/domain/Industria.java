package Cap14.interfaces.empresa.domain;

public class Industria extends Empresa {

    private boolean  compensaEmissaoCo2;


    public Industria(String razaoSocial, double totalFaturamento, boolean compensaEmissaoCo2) {
        super(razaoSocial, totalFaturamento);
        this.compensaEmissaoCo2 = compensaEmissaoCo2;
    }

    public Industria(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    public boolean isCompensaEmissaoCo2() {
        return compensaEmissaoCo2;
    }

    public void setCompensaEmissaoCo2(boolean compensaEmissaoCo2) {
        this.compensaEmissaoCo2 = compensaEmissaoCo2;
    }

    @Override
    public double calcularLimiteAprovado() {
        return 0;
    }
}