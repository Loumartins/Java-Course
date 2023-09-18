package Cap18.Collections.mapas.exercicio.domain;

import java.util.Objects;

public class Cidade implements Comparable<Cidade>{
    private int codigoIBGE;
    private String nome;
    private int totalHabitantes;

    public Cidade(int codigoIBGE, String nome, int totalHabitantes) {
        Objects.requireNonNull(codigoIBGE);
        Objects.requireNonNull(nome);
        this.codigoIBGE = codigoIBGE;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;
    }

    public int getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(int codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(int totalHabitantes) {
        this.totalHabitantes = totalHabitantes;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "codigoIBGE=" + codigoIBGE +
                ", nome='" + nome + '\'' +
                ", totalHabitantes=" + totalHabitantes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cidade cidade = (Cidade) o;

        return codigoIBGE == cidade.codigoIBGE;
    }

    @Override
    public int hashCode() {
        return codigoIBGE;
    }


    @Override
    public int compareTo(Cidade o) {
        return Integer.compare(this.codigoIBGE, o.codigoIBGE);
    }
}
