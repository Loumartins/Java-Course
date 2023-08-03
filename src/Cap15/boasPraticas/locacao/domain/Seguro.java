package Cap15.boasPraticas.locacao.domain;

public interface Seguro {
    double calcularPremio(int horasUtilizadas, double valorContrato);
}
