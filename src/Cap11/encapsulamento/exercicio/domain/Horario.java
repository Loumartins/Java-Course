package Cap11.encapsulamento.exercicio.domain;

public class Horario {
    private int hora;
    private int minuto;

    public Horario(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23){
            throw new RuntimeException("Hora inválida: " + hora);
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59){
            throw new RuntimeException("Minuto inválido: " + minuto);
        }
        this.minuto = minuto;
    }
    public String formatar(){
        return String.format("%d:%d", getHora(), getMinuto());
    }
}
