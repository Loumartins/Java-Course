package Cap24.ClassesAninhadas.classesAnonimas.domain;

import java.math.BigDecimal;

public interface Transacao {

    BigDecimal getValorTotal();

    void reembolsar();
}
