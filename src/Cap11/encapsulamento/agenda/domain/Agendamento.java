package Cap11.encapsulamento.agenda.domain;

public class Agendamento {
    private Horario horario;
    private String descricao;


    public Agendamento(Horario horario, String descricao) {
        this.horario = new Horario(horario.hora(), horario.minuto());
        this.descricao = descricao;
    }

    public Horario getHorario() {
        return new Horario(horario.hora(), horario.minuto());
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

    public String getHorarioFormatado() {
        return horario.formatar();
    }
}
