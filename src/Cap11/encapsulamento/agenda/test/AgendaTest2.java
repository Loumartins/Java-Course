package Cap11.encapsulamento.agenda.test;

import Cap11.encapsulamento.agenda.domain.Agendamento;
import Cap11.encapsulamento.agenda.domain.Horario;

public class AgendaTest2 {
    public static void main(String[] args) {
        Horario horario = new Horario(10,30);
        Agendamento agendamento = new Agendamento(horario, "Corte de cabelo");
    }
}
