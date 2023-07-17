package Cap14.interfaces.empresa.domain;

public interface PessoaBonificavel extends ClienteFinanciavel {
    double calcularBonus(double percentualMetaAlcancada);
}
