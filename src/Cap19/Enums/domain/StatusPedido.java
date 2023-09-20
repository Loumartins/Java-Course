package Cap19.Enums.domain;

public enum StatusPedido {
    RASCUNHO {
        @Override
        public boolean podeMudarParaCancelado() {
            return true;
        }
    },
    EMITIDO(12){
        @Override
        public boolean podeMudarParaCancelado() {
            return true;
        }
    },
    FATURADO(10){
        @Override
        public boolean podeMudarParaCancelado() {
            return false;
        }
    },
    SEPARADO (8){
        @Override
        public boolean podeMudarParaCancelado() {
            return false;
        }
    },
    DESPACHADO(6){
        @Override
        public boolean podeMudarParaCancelado() {
            return false;
        }
    },
    ENTREGUE (0){
        @Override
        public boolean podeMudarParaCancelado() {
            return false;
        }
    },
    CANCELADO {
        @Override
        public boolean podeMudarParaCancelado() {
            return false;
        }
    };

    private Integer tempoEntregaEmHoras;

    StatusPedido(){

    }
    // a implementacao do construtor é feita diretamente no proprio Enum.
    StatusPedido(Integer tempoEntregaEmHoras) {
        this.tempoEntregaEmHoras = tempoEntregaEmHoras;
    }

    public Integer getTempoEntregaEmHoras() {
        return tempoEntregaEmHoras;
    }

    public abstract boolean podeMudarParaCancelado();
}
