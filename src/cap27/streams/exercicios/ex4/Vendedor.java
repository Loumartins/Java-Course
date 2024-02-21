package cap27.streams.exercicios.ex4;

public class Vendedor {
    private String nome;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
