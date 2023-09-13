package Cap18.Collections.ArrayList.domain.hotelaria.megasena.domain;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {

    private static final Random RANDOM = new Random();

    private int quantidadeSorteada;

    @Override
    public boolean hasNext() {
        return quantidadeSorteada < 6;
    }

    @Override
    public Integer next() {

        if (!hasNext()){
            throw new NoSuchElementException("Todos os numeros ja foram sorteados");
        }
        quantidadeSorteada++;
        return RANDOM.nextInt(60);
    }
}
