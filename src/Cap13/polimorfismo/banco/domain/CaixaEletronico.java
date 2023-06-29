package Cap13.polimorfismo.banco.domain;

import Cap13.polimorfismo.banco.domain.ContaEspecial;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;
    public void transferir(Conta contaOrigem, Conta contaDestino,
                           double valorTransferencia){
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n"
        ,valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(), contaDestino.getNumero(),
                contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

    public void imprimirDemonstrativo(Conta conta){
      debitarTarefarImpressaoDemonstrativo(conta);
      conta.imprimirDemonstrativo();
    }
    public void imprimirDemonstrativo(ContaInvestimento contaInvestimento){
        if (contaInvestimento.getValorTotalInvestimento() > 0){
            //  ContaInvestimento contaInvestimento = (ContaInvestimento) conta;
            System.out.println("Impressao do demonstrativo é gratuita");
        } else{
            debitarTarefarImpressaoDemonstrativo(contaInvestimento);
        }

        contaInvestimento.imprimirDemonstrativo();
    }

    private static void debitarTarefarImpressaoDemonstrativo(Conta conta) {
        System.out.printf("Custo da impressão: R$:%.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}
