package Cap14.interfaces.seguro.dominio;

import Cap14.interfaces.seguro.interfaces.BemSeguravel;

public class ImovelResidencial implements BemSeguravel {
    public static final double TAXA_VALOR_MERCADO = 0.01;
    public static final double TAXA_AREA_CONSTRUIDA = 0.30;
    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;

    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {

        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        double calculoValorPremio = (getValorMercado() * TAXA_VALOR_MERCADO) + (TAXA_AREA_CONSTRUIDA * getAreaConstruida());
        return calculoValorPremio;
    }

    @Override
    public String descrever() {
        return null;
    }
}
