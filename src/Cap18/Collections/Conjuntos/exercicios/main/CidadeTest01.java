package Cap18.Collections.Conjuntos.exercicios.main;

import Cap18.Collections.Conjuntos.exercicios.domain.Cidade;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CidadeTest01 {
    public static void main(String[] args) {

        // Performance é mais importante (não garante a ordem dos elementos)
        Set<Cidade> cidades = new HashSet<>();

        // Performance é importante, mas precisa manter ordem de inserção dos elementos
        //Set<Cidade> cidades = new LinkedHashSet<>();

        //Performance é menos importante e precisa manter a ordem natural dos elementos
        //Set<Cidade> cidades = new TreeSet<>();





        cidades.add(new Cidade(4323232, "Macae", 200_000));
        cidades.add(new Cidade(3323443, "Campos dos Goytacazes", 100_000));
        cidades.add(new Cidade(13221, "Araruama", 50_000));
        cidades.add(new Cidade(54604, "Arraial do cabo", 20_000));

        impressora(cidades);
    }
    static void impressora(Set<Cidade> cidades){
        for (Cidade cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
