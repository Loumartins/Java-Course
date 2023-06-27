package Cap12.heranca.banco.domain;

public class ContaEspecial extends ContaInvestimento {

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    private double tarifaMensal;
    private double limiteChequeEspecial;

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

    public void debitarTarifaMensal(){
        sacar(getTarifaMensal());
    }
    public double getSaldoDisponivel(){
        return getSaldo() + getLimiteChequeEspecial();
    }
    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.println("Saldo Disponivel: " + getSaldoDisponivel());
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque <= 0){
            throw new IllegalArgumentException("Nao é possivel sacar um valor menor ou igual a 0");
        }
        if (getSaldoDisponivel() < valorSaque){
            throw new RuntimeException("Saldo insuficiente para saque");
        }
        setSaldo(getSaldo() - valorSaque);
    }
}
