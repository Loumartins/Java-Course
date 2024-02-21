package cap27.streams.exercicios.ex2;

import java.util.ArrayList;
import java.util.List;

public class PessoaTest {

    /*
    Dada uma lista de objetos Pessoa com atributos nome e idade,
    utilize streams para criar uma lista apenas com os nomes das pessoas.
     */

    public static void main(String[] args) {
        List<Pessoa> pessoaList = new ArrayList<>();
        pessoaList.add(new Pessoa("Luiz ", 27));
        pessoaList.add(new Pessoa("Euridice ", 26));
        pessoaList.add(new Pessoa("Orfeu ", 61));
        pessoaList.add(new Pessoa("Amara ", 43));
        pessoaList.add(new Pessoa("Carla", 25));

        pessoaList.stream()
                .map(Pessoa::getNome)
                .forEach(System.out::println);
    }
}
