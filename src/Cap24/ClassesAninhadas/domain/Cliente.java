package Cap24.ClassesAninhadas.domain;

import java.util.Comparator;
import java.util.List;

public class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void ordenarPorIdade(List<Cliente> cliente){
        cliente.sort(new IdadeComparator());
    }

    private static class IdadeComparator implements Comparator<Cliente>{

        @Override
        public int compare(Cliente o1, Cliente o2) {
            return Integer.compare(o1.idade, o2.idade);
        }
    }
}
