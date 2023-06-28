package Cap13.polimorfismo.banco.domain;

public class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(int agencia, int numero, Titular titular) {
        super(agencia, numero, titular);
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
        return getSaldo() + limiteChequeEspecial;
    }

    @Override
    public final void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());
    }

    @Override
    protected void validarSaldoParaSaque(double valorSaque) {
        super.validarSaldoParaSaque(valorSaque);
    }
}
