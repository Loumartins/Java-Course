package Cap17.generic2.Game.test;

import Cap17.generic2.Game.domain.ConstruindoObjetosDoJogador;
import Cap17.generic2.Game.domain.Helmet;

public class ConstruindoObjetosDoJogadorTest01 {
    public static void main(String[] args) {
        Helmet helmet01 = new Helmet();
        ConstruindoObjetosDoJogador<Helmet> helmet = new ConstruindoObjetosDoJogador<>(helmet01);

       helmet01.setNome("Gold helmet");



    }
}
