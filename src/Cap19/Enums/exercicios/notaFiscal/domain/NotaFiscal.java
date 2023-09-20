package Cap19.Enums.exercicios.notaFiscal.domain;

public class NotaFiscal {
    private final Integer numero;
    private final String descricao;
    private final double valor;

    private StatusNotaFiscal status = StatusNotaFiscal.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusNotaFiscal getStatus() {
        return status;
    }

    public void emitir(){
        if (getStatus().emitir()){
            status = StatusNotaFiscal.EMITIDA;
        }else {
            throw new IllegalStateException("Nota fiscal não pode ser emitida");
        }
    }

    public void cancelarNf(){
        if (getStatus().cancelar(getValor())){
            status = StatusNotaFiscal.CANCELADA;
        } else {
            throw new IllegalArgumentException("Nota fiscal nao pode ser cancelada");
        }
    }

}
