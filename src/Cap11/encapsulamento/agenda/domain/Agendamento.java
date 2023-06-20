package Cap11.encapsulamento.agenda.domain;

public class Agendamento {
    private Horario horario;
    private String descricao;

    public Agendamento() {
    }

    public Agendamento(Horario horario, String descricao) {
        this.horario = horario;
        this.descricao = descricao;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
