package Cap10.construtores.exc.domain;

public class Participante {
    public String nome;
    public int saldoDePontos;

    public Participante(String nome) {
        this.nome = nome;
    }

    public Participante(String nome, int saldoDePontosInicial) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }
}

