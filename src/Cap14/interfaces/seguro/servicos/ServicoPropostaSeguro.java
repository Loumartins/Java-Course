package Cap14.interfaces.seguro.servicos;

import Cap14.interfaces.seguro.interfaces.BemSeguravel;

public class ServicoPropostaSeguro {
    public void emitir(BemSeguravel bemSeguravel){
        System.out.println("--------------");
        System.out.println("Proposta de seguro");
        System.out.println("--------------");
        System.out.println(bemSeguravel.descrever());
        System.out.printf("Prêmio: %.2f%n", bemSeguravel.calcularValorPremio());
    }
}
