package Cap5.composicaoObjetos.domain;

public class Aeronave {
    public boolean ativo;
    public int totalAssentos;
    public int assentosReservados;

    public int calcularAssentosDisponiveis(){
        return totalAssentos - assentosReservados;
    }

    public void desativar(){
        if (assentosReservados > 0){

        } else {
            this.ativo = false;
        }
    }
    public void ativar(){
        this.ativo = true;
    }

    public void reservarAssentos(int numerosAssentos){
        if (this.ativo == true){
            this.assentosReservados+= numerosAssentos;
        } else {
            //
            System.out.println("Nao é possível reservar assentos pois a aeronave esta inativa");
        }
    }
}
