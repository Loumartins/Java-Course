package Cap5.composicaoObjetos.domain;

public class Aeronave {
    public boolean ativo = true;
    public int totalAssentos;
    public int assentosReservados;

    public int calcularAssentosDisponiveis(){
        return totalAssentos - assentosReservados;
    }
}
