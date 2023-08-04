package Cap15.boasPraticas.banco.javabank;

public interface Conta {
    double getSaldo();

    void sacar(double valor);

    void depositar(double valor);

    void transferir (Conta conta, double valor);
}