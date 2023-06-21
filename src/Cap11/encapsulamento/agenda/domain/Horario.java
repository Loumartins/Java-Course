package Cap11.encapsulamento.agenda.domain;

public record Horario(int hora, int minuto) {
    public Horario {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Não é possivel indicar a hora solicitada");
        }
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Nao é possivel indicar o minuto solicitado");
        }

    }


    public String formatar() {
        return String.format("%dh%dm", hora(), minuto());
    }
}
