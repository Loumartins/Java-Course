package Cap18.Collections.Conjuntos.Contato.domain;

import java.util.Comparator;

public class IdadeContatoComparator implements Comparator<Contato> {
    @Override
    public int compare(Contato o1, Contato o2) {
        return Double.compare(o1.getIdade(), o2.getIdade()) ;
    }
}
