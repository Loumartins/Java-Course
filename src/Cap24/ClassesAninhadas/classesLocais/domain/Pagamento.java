package Cap24.ClassesAninhadas.classesLocais.domain;

import java.math.BigDecimal;

public class Pagamento implements Transacao{

    private BigDecimal taxa;
    private BigDecimal valor;

    public Pagamento(BigDecimal taxa, BigDecimal valor) {
        this.taxa = taxa;
        this.valor = valor;
    }

    @Override
    public BigDecimal getValorTotal() {
        return valor.add(taxa);
    }
}
