package Cap10.construtores.exc.domain;

import java.util.Objects;

public class Participante {
    public String nome;
    public int saldoDePontos;


    public Participante(String nome) {
        this(nome,0);

    }

    public Participante(String nome, int saldoDePontosInicial) {
        Objects.requireNonNull(nome, "Nome nao pode ser nulo");
        this.nome = nome;
        if (saldoDePontosInicial < 0 ){
            throw new IllegalArgumentException("Saldo inicial de ponto nao pode ser negativo");
        }
        this.saldoDePontos = saldoDePontosInicial;
    }
}

