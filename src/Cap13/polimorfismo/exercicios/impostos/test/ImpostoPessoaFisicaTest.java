package Cap13.polimorfismo.exercicios.impostos.test;

import Cap13.polimorfismo.exercicios.impostos.domain.GestorImposto;
import Cap13.polimorfismo.exercicios.impostos.domain.PessoaFisica;

public class ImpostoPessoaFisicaTest {
    public static void main(String[] args) {
        var gestorImpostos = new GestorImposto();

        var joao = new PessoaFisica("Joao da Silva", 45_000);
        var maria = new PessoaFisica("Maria de Souza", 180_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);

        System.out.printf("Total de impostos: %.2f%n", gestorImpostos.getValorTotalImpostos());
    }
}
