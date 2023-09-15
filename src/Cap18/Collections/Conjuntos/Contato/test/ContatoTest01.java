package Cap18.Collections.Conjuntos.Contato.test;

import Cap18.Collections.Conjuntos.Contato.domain.Contato;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContatoTest01 {
    public static void main(String[] args) {

        /*
        Se o equals na comparação de objetos retornar true o hashcode necessariamente
        tambem precisa retornar true.
        Porem se o equals retornar false o hashcode PODE ou NAO retornar true.

        O ideal é que objetos diferentes retornem codigos hash diferentes!!!
         */

        Set<Contato> contatos = new TreeSet<>();

        Contato contato1 = new Contato("Maria", "maria@algaworks.com", 40);
        Contato contato2 = new Contato("Ana", "ana@algaworks.com", 30);
        Contato contato3 = new Contato("José", "jose@algaworks.com", 25);
        Contato contato4 = new Contato("Rosa", "rosa@algaworks.com", 50);
        Contato contato5 = new Contato("João", "joao@algaworks.com", 70);

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);
        //contatos.add(null);


        for (Contato contato : contatos) {
            System.out.println(contato);
        }

//        System.out.println(contato1.hashCode());
//        System.out.println(contato2.hashCode());
//        System.out.println(contato3.hashCode());
//        System.out.println(contato4.hashCode());



    }
}
