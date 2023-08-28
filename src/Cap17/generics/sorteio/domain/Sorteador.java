package Cap17.generics.sorteio.domain;

import java.util.Random;

public class Sorteador {

    private static final Random RANDOM = new Random();

    public static Cliente sortear(Cliente[] objetos){
        if (objetos.length == 0){
            throw new IllegalArgumentException("Mínimo de 1 objeto requerido");
        }
        int posicao = RANDOM.nextInt(objetos.length);
        return objetos[posicao];
    }
}
