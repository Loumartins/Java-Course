package Cap19.Enums.domain;

public enum StatusPedido {
    RASCUNHO,
    EMITIDO(12),
    FATURADO(10),
    SEPARADO (8),
    DESPACHADO(6),
    ENTREGUE (0),
    CANCELADO;

    private Integer tempoEntregaEmHoras;

    StatusPedido(){

    }

    StatusPedido(Integer tempoEntregaEmHoras) {
        this.tempoEntregaEmHoras = tempoEntregaEmHoras;
    }

    public Integer getTempoEntregaEmHoras() {
        return tempoEntregaEmHoras;
    }
}
