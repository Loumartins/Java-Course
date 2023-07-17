package Cap14.interfaces.empresa.servico;

import Cap14.interfaces.empresa.domain.ClienteFinanciavel;

public class ServicoFinanciamento {
    public void solicitarFinanciamento(ClienteFinanciavel clienteFinanciavel, double valorSolicitado){
        double limiteAprovado = clienteFinanciavel.calcularLimiteAprovado();

        if (limiteAprovado < valorSolicitado){
            throw new RuntimeException(String.format("Financiamento nao aprovado. Limite máximo de" +
                    "%.2f ", limiteAprovado));
        }

        System.out.printf("DEBUG: Financiamento aprovado.Limite máximo de %.2f%n", limiteAprovado);
    }
    public double consultarLimiteAprovado(ClienteFinanciavel clienteFinanciavel){
        return clienteFinanciavel.calcularLimiteAprovado();
    }

}
