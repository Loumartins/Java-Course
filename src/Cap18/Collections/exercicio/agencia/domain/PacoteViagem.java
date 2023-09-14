package Cap18.Collections.exercicio.agencia.domain;

public class PacoteViagem {
    private String descricao;
    private double precoPorPessoa;

    public PacoteViagem(String descricao, double precoPorPessoa) {
        this.descricao = descricao;
        this.precoPorPessoa = precoPorPessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    public void setPrecoPorPessoa(double precoPorPessoa) {
        this.precoPorPessoa = precoPorPessoa;
    }

    @Override
    public String toString() {
        return "PacoteViagem{" +
                "descricao='" + descricao + '\'' +
                ", precoPorPessoa=" + precoPorPessoa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacoteViagem that = (PacoteViagem) o;

        if (Double.compare(that.precoPorPessoa, precoPorPessoa) != 0) return false;
        return descricao.equals(that.descricao);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = descricao.hashCode();
        temp = Double.doubleToLongBits(precoPorPessoa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


}
