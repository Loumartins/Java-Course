package Cap19.Enums.exercicios.notaFiscal.domain;

public enum StatusNotaFiscal {
    NAO_EMITIDA ("Nao emitida"){
        @Override
        public boolean emitir() {
            return false;
        }
    }
    ,
    EMITIDA ("Emitida"){
        @Override
        public boolean emitir() {
            return true;
        }
    },
    CANCELADA ("Cancelada"){
        @Override
        public boolean emitir() {
            return false;
        }
    };

    private String descricao;

    StatusNotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public abstract boolean emitir();

    public boolean cancelar(double valorPedido){
        return StatusNotaFiscal.EMITIDA.equals(this) && valorPedido <= 1000 || StatusNotaFiscal.NAO_EMITIDA.equals(this);
    };

    public String getDescricao() {
        return descricao;
    }
}
