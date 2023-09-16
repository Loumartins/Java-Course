package Cap18.Collections.Conjuntos.exercicios.domain;

import java.util.Comparator;

public class Cidade implements Comparable <Cidade> {
    private int CodigoIbge;
    private String nome;
    private int totalHabitantes;

    public Cidade(int codigoIbge, String nome, int totalHabitantes) {
        CodigoIbge = codigoIbge;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;
    }

    public int getCodigoIbge() {
        return CodigoIbge;
    }

    public void setCodigoIbge(int codigoIbge) {
        CodigoIbge = codigoIbge;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cidade cidade = (Cidade) o;

        return CodigoIbge == cidade.CodigoIbge;
    }

    @Override
    public int hashCode() {
        return CodigoIbge;
    }


    @Override
    public int compareTo(Cidade o) {
        return Integer.compare(getCodigoIbge(), o.getCodigoIbge());
    }
}

