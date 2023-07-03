package Cap13.polimorfismo.exercicios.impostos.test;

import Cap13.polimorfismo.exercicios.impostos.domain.EmpresaLucroReal;
import Cap13.polimorfismo.exercicios.impostos.domain.EmpresaSimples;
import Cap13.polimorfismo.exercicios.impostos.domain.GestorImposto;
import Cap13.polimorfismo.exercicios.impostos.domain.PessoaFisica;

public class ImpostoPessoaJuridicaTest {
    public static void main(String[] args) {
        var gestorImpostos = new GestorImposto();

        var joao = new PessoaFisica("Joao da Silva", 45_000);
        var maria = new PessoaFisica("Maria de Souza", 18_000);

        var barDoZe = new EmpresaSimples("Bar do Zé", 250_000,160_000 );
        var codeConsultoria = new EmpresaLucroReal("Code Consultoria", 8_000_000, 6_000_000 );

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(codeConsultoria);



    }
}
