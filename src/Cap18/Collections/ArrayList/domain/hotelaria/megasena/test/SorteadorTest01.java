package Cap18.Collections.ArrayList.domain.hotelaria.megasena.test;

import Cap18.Collections.ArrayList.domain.hotelaria.megasena.domain.Sorteador;

public class SorteadorTest01 {
    public static void main(String[] args) {
        Sorteador sorteador = new Sorteador();

        for (Integer integer : sorteador) {
            System.out.println(integer);
        }
    }
}
