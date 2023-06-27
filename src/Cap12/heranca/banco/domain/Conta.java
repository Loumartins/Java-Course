package Cap12.heranca.banco.domain;

public class Conta {
    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

//    public Conta(){
//        this(0);
//    }
    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valorSaque){
        if (valorSaque <= 0){
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }
        if (valorSaque > saldo){
            throw new RuntimeException("Valor de saldo deve ser maior que valor do saque");
        }
        saldo -=valorSaque;
    }
    public void depositar(double valorDeposito){
        if (valorDeposito <= 0){
            throw new IllegalArgumentException("Valor de deposito deve ser maior que 0");
        }
        saldo+= valorDeposito;
    }
    public void imprimirDemonstrativo(){
        System.out.println("Agência: "+ getAgencia());
        System.out.println("Conta: " +getNumero());
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo: " + getSaldo());
    }
}
