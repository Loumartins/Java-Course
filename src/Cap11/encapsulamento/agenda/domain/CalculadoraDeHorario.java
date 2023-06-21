package Cap11.encapsulamento.agenda.domain;

public class CalculadoraDeHorario {


    private CalculadoraDeHorario() {
    }

    public static Horario somarDuasHoras(Horario horario){
        int hora = horario.hora() + 2;

        if (hora > 24){
            hora = hora;
        }
       // horario.setHora(hora);
        return new Horario(hora, horario.minuto());
    }
}
