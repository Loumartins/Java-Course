package Cap10.construtores.exc.test;

import Cap10.construtores.exc.domain.Participante;

public class ParticipanteTest {
    public static void main(String[] args) {

        Participante participante1 = new Participante(null);
        System.out.println(participante1.nome);
    }
}
