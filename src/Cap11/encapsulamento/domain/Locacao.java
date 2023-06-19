package Cap11.encapsulamento.domain;

public class Locacao {
    private Veiculo veiculo;
    private int quantidadeDiarias;

    public Locacao() {
    }

    public Locacao(Veiculo veiculo, int quantidadeDiarias) {
        this.veiculo = veiculo;
        this.quantidadeDiarias = quantidadeDiarias;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }


}
