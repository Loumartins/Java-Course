package Cap11.encapsulamento.agenda.test;

import Cap11.encapsulamento.agenda.domain.Agendamento;
import Cap11.encapsulamento.agenda.domain.CalculadoraDeHorario;
import Cap11.encapsulamento.agenda.domain.Horario;

public class AgendaTest2 {
    public static void main(String[] args) {
        Horario horario = new Horario(10,30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");

        Horario novoHorario = CalculadoraDeHorario.somarDuasHoras(horario);

        agendamentoCabelo.setHorario(new Horario(15, 45));

        System.out.println(agendamentoCabelo.getHorarioFormatado());
        System.out.println(novoHorario.formatar());


    }
}

