package Cap14.interfaces.seguro.dominio;

public class Caminhao extends VeiculoAutomotor{
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
        double calculoValorPremio = (getValorMercado() * 0.02) + (50 * getQuantidadeEixos());
        return calculoValorPremio;
    }

    @Override
    public String descrever() {
        return null;
    }
}
