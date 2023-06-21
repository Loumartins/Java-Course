package Cap11.encapsulamento.agenda.domain;

public class Horario {
    private final int hora;
    private final int minuto;


    public Horario(int hora, int minuto) {
        if (hora < 0 || hora > 23){
        throw new IllegalArgumentException("Não é possivel indicar a hora solicitada");
    }
        if (minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Nao é possivel indicar o minuto solicitado");
        }

        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }


    public String formatar(){
        return String.format("%dh%dm", getHora(), getMinuto());
    }
}
