package Cap13.polimorfismo.impostos.domain;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public abstract double calcularImposto();
}
