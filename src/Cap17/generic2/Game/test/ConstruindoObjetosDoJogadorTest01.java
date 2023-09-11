package Cap17.generic2.Game.test;

import Cap17.generic2.Game.domain.ConstruindoObjetosDoJogador;
import Cap17.generic2.Game.domain.Helmet;

public class ConstruindoObjetosDoJogadorTest01 {
    public static void main(String[] args) {
        ConstruindoObjetosDoJogador<Helmet> helmet = new ConstruindoObjetosDoJogador<>(new Helmet("Gold helmet"));

        String nome = helmet.print();

        System.out.println(nome);

    }
}
