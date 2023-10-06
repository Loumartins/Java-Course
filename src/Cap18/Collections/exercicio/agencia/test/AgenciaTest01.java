package Cap18.Collections.exercicio.agencia.test;

import Cap18.Collections.exercicio.agencia.domain.CadastroPacoteViagem;
import Cap18.Collections.exercicio.agencia.domain.PacoteViagem;

import java.util.List;

public class AgenciaTest01 {
    public static void main(String[] args) {
        CadastroPacoteViagem cadastroPacoteViagem = new CadastroPacoteViagem();

        //utilizando o metodo adicionar de uma outra forma

//        PacoteViagem pacoteViagem = new PacoteViagem("Istambul e Capadocia(20 noites)", 18_000);
//        cadastroPacoteViagem.adicionar(pacoteViagem);


        cadastroPacoteViagem.adicionar("Istambul e Capadócia(20 noites)", 18_000);
        cadastroPacoteViagem.adicionar("Neve em Bariloche (10 noites)", 11_000);
        cadastroPacoteViagem.adicionar("Disney (10 noites)", 20_000);
        cadastroPacoteViagem.adicionar("Natal Luz em Gramado (5 noites)", 8_500);

        cadastroPacoteViagem.removerPorDescricao("Disney (10 noites)");

//        cadastroPacoteViagem.ordenar();

//        cadastroPacoteViagem.ordenarPorPreco();

//        PacoteViagem pacoteEncontrado = cadastroPacoteViagem.buscarPorDescricao("Disney (10 noites)");
//        System.out.println(pacoteEncontrado);

         // imprimirPacotes(cadastroPacoteViagem.obterTodos());



    }

    private static void imprimirPacotes(List<PacoteViagem> pacotes){
        for (PacoteViagem pacote : pacotes) {
            System.out.println(pacote);
        }
    }
}
