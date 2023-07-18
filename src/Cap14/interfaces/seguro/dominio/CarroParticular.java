package Cap14.interfaces.seguro.dominio;

public class CarroParticular extends VeiculoAutomotor {


    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double calculoValorPremio = getValorMercado() * 0.04;
        if (getAnoFabricacao() < 2000){
            calculoValorPremio+= calculoValorPremio * 0.05;
            return calculoValorPremio;
        }
        return calculoValorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Carro particular do ano %d e avaliado em %.2f", getAnoFabricacao(), getValorMercado());
    }
}
