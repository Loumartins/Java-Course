package Cap14.interfaces.seguro.dominio;

public class Caminhao extends VeiculoAutomotor{
    public static final double TAXA_VALOR_MERCADO = 0.02;
    public static final int VALOR_POR_EIXO = 50;
    private int quantidadeEixos;


    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {

        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double calculoValorPremio = (getValorMercado() * TAXA_VALOR_MERCADO) + (VALOR_POR_EIXO * getQuantidadeEixos());
        return calculoValorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Caminhao do ano de %d, avaliado em %.2f", getAnoFabricacao(), getValorMercado());
    }
}
