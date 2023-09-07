package Cap18.Collections.megasena.test;

import Cap18.Collections.megasena.domain.Sorteador;

import java.util.Iterator;

public class SorteadorTest01 {
    public static void main(String[] args) {
        Sorteador sorteador = new Sorteador();

        for (Integer integer : sorteador) {
            System.out.println(integer);
        }
    }
}
