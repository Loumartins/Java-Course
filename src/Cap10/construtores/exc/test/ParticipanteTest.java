package Cap10.construtores.exc.test;

import Cap10.construtores.exc.domain.Participante;

public class ParticipanteTest {
    public static void main(String[] args) {


        Participante participante1 = new Participante("Fernando");
        participante1.imprimir();

        Participante participante2 = new Participante("Jose", 35);
        participante2.imprimir();

    }
}
