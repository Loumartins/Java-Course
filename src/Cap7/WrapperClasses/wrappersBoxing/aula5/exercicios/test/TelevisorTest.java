package Cap7.WrapperClasses.wrappersBoxing.aula5.exercicios.test;

import Cap7.WrapperClasses.wrappersBoxing.aula5.exercicios.domain.ControleRemoto;
import Cap7.WrapperClasses.wrappersBoxing.aula5.exercicios.domain.Televisor;

public class TelevisorTest {
    public static void main(String[] args) {
        Televisor tv = new Televisor();

        tv.controleRemoto = new ControleRemoto();

        tv.controleRemoto.volume = 30;
        tv.controleRemoto.canal = 150;

        tv.controleRemoto.mudarCanal(45);

    }
}
