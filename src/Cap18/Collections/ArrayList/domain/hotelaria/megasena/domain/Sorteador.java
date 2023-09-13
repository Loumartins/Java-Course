package Cap18.Collections.ArrayList.domain.hotelaria.megasena.domain;

import java.util.Iterator;

public class Sorteador implements Iterable<Integer>{


    @Override
    public Iterator<Integer> iterator() {
        return new SorteadorIterator() ;
    }
}
