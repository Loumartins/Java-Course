package Cap16.exceptions.exercicios.domain;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativo(){
        return !isAtiva();
    }

    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("O valor de saque deve ser maior que 0");

        }
        if (valor > this.saldo){
            throw new ContaSemSaldoException("É necessário que a conta " +
                    "tenha saldo para efetuar o saque");

        }
        if (isInativo()){
            throw new ContaInativaException("Conta inativa");
        }
        this.saldo-= valor;
    }
    public void depositar(double valor) {
        if (valor <= 0) {
           throw new IllegalArgumentException("Valor de depósito deve ser maior que 0");
        }

        if (isInativo()) {
            throw new ContaInativaException("Conta inativa");
        }

        this.saldo += valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        if (contaDestino.isInativo()) {
           throw new ContaInativaException("Conta de destino está inativa");
        }
        contaDestino.depositar(valor);
    }

}
