package Cap17.generic2.Game.domain;

public class Helmet implements PlayerObject {

    private String nome;

    public Helmet(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
