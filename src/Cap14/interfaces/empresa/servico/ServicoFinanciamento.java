package Cap14.interfaces.empresa.servico;

import Cap14.interfaces.empresa.domain.Empresa;

public class ServicoFinanciamento {
    public void solicitarFinanciamento(Empresa empresa, double valorSolicitado){
        double limiteAprovado = empresa.calcularLimiteAprovado();

        if (limiteAprovado < valorSolicitado){
            throw new RuntimeException(String.format("Financiamento nao aprovado. Limite máximo de" +
                    "%.2f ", limiteAprovado));
        }

        System.out.printf("DEBUG: Financiamento aprovado.Limite máximo de %.2f%n", limiteAprovado);
    }
    public double consultarLimiteAprovado(Empresa empresa){
        return empresa.calcularLimiteAprovado();
    }

}
