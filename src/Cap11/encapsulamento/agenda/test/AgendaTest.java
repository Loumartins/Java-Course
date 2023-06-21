package Cap11.encapsulamento.agenda.test;

import Cap11.encapsulamento.agenda.domain.Agendamento;
import Cap11.encapsulamento.agenda.domain.Horario;

public class AgendaTest {
    public static void main(String[] args) {
        Horario horario = new Horario(10, 30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");
        horario.setHora(11);
        horario.setMinuto(45);
        Agendamento agendamentoBarba = new Agendamento(horario, "Corte de barba");

        imprimir(agendamentoCabelo);
        imprimir(agendamentoBarba);
    }
    public static void imprimir(Agendamento agendamento){
        System.out.printf("%s às %s%n", agendamento.getDescricao(), agendamento.getHorarioFormatado());
    }
}
