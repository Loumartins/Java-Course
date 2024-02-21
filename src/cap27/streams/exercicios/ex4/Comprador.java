package cap27.streams.exercicios.ex4;

public class Comprador {

    private String nome;

    public Comprador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
