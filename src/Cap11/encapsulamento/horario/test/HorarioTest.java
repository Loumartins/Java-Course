package Cap11.encapsulamento.horario.test;

import Cap11.encapsulamento.horario.domain.Horario;

public class HorarioTest {
    public static void main(String[] args) {
        Horario horario = new Horario(15, 38);
        String hora = horario.formatar();
        System.out.println(hora);
    }
}
