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

    public void sacar(double valorSaque){
        if (valorSaque > getSaldo()){
            throw new IllegalArgumentException("Valor do saque é maior que o valor de saldo");
        }
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
