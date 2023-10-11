package Cap21.Numeros.domain;

import java.math.BigDecimal;

public class ContaCorrente {
    private BigDecimal valor = BigDecimal.ZERO;

    public BigDecimal getValor() {
        return valor;
    }

//    public void setValor(double valor) {
//        this.valor = valor;
//    }

    public void depositar (BigDecimal valorDeposito) {
       valor = valor.add(valorDeposito);
    }

    public void sacar (BigDecimal valorSaque){
        if (valorSaque.compareTo(valor) > 0){
            throw new RuntimeException(String.format("Saque: %s, saldo: %s", valorSaque, valor));
        }
       valor = valor.subtract(valorSaque);
    }
}

