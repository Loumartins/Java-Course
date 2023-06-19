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

    public GrupoVeiculo getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoVeiculo grupo) {
        this.grupo = grupo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getValorDiaria() {
        return grupo.getValorDiaria();
    }
}
