package Cap24.ClassesAninhadas.naoEstaticas.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContaCorrente {
    private BigDecimal saldo;
    private List<Transacao> transacoes = new ArrayList<>();

    public ContaCorrente(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return Collections.unmodifiableList(transacoes);
    }

    public class Transacao {
        private String descricao;
        private BigDecimal valor;

        public Transacao(String descricao, BigDecimal valor) {
            this.descricao = descricao;
            this.valor = valor;
            ContaCorrente.this.saldo = ContaCorrente.this.saldo.subtract(valor);
            ContaCorrente.this.transacoes.add(this);
            //utilizando o this qualificado estamos nos precavendo do shadowing em classes aninhadas
        }

        public String getDescricao() {
            return descricao;
        }

        public BigDecimal getValor() {
            return valor;
        }
    }
}
