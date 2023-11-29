package Cap24.ClassesAninhadas.classesLocais.domain;

import java.math.BigDecimal;

public class Tarifa implements Transacao {

    private BigDecimal valor;

    public Tarifa(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public BigDecimal getValorTotal() {
        return valor;
    }
}
