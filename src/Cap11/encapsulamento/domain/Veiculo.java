package Cap11.encapsulamento.domain;

public class Veiculo {
    public String placa;
    public boolean disponivel = true;
    private GrupoVeiculo grupo;

    public Veiculo() {
    }

    public Veiculo(String placa, GrupoVeiculo grupo) {
        this.placa = placa;
        this.grupo = grupo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
