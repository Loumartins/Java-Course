package Cap13.polimorfismo.banco.domain;

public class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(int agencia, int numero, Titular titular, double tarifaMensal) {
        super(agencia, numero, titular);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    public double getSaldoDisponivel(){
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    public final void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());
    }

    @Override
    protected final void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void depitarTarifaMensal(){
        sacar(getTarifaMensal());
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "tarifaMensal=" + tarifaMensal +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                "} " + super.toString();
    }
}
