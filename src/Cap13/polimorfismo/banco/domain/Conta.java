package Cap13.polimorfismo.banco.domain;

public class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Titular titular;

    public Conta(int agencia, int numero, Titular titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public boolean possuiGratuidadeDeImpressao(){
        return false;
    }
    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldo() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void sacar(double valorSaque){
        if (valorSaque <= 0){
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        validarSaldoParaSaque(valorSaque);

        saldo-=valorSaque;
    }
    public void depositar(double valorDeposito){
        if (valorDeposito <= 0){
            throw new IllegalArgumentException("Valor de deposito nao pode ser menor ou igual a 0");
        }
        saldo+=valorDeposito;
    }
    public void imprimirDemonstrativo(){
        System.out.println("Nome: " + titular.getNome());
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
