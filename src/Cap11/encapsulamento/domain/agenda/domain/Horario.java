package Cap11.encapsulamento.domain.agenda.domain;

public class Horario {
    private int hora;
    private int minuto;

    public Horario() {
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23){
            throw new IllegalArgumentException("Não é possivel colocar a hora solicitada");
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Nao é possivel indicar o minuto solicitado");
        }
        this.minuto = minuto;
    }


}
