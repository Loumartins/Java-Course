package Cap19.Enums.domain;

public class Pedido {

    private String nomeCliente;

    private StatusPedido statusPedido = StatusPedido.RASCUNHO;
    private OrigemPedido origemPedido;
    public String getNomeCliente() {
        return nomeCliente;
    }

    public Pedido(StatusPedido statusPedido, String nomeCliente, OrigemPedido origemPedido) {
        this.statusPedido = statusPedido;
        this.nomeCliente = nomeCliente;
        this.origemPedido = origemPedido;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

//    public void setStatusPedido(StatusPedido statusPedido) {
//        this.statusPedido = statusPedido;
//    }

    public OrigemPedido getOrigemPedido() {
        return origemPedido;
    }

    public void setOrigemPedido(OrigemPedido origemPedido) {
        this.origemPedido = origemPedido;
    }

    public void imprimirPedido(Pedido pedido){
        System.out.println("Nome do cliente: " + getNomeCliente() + " - status do pedido: " + getStatusPedido() + " - origem do pedido: " + getOrigemPedido());
    }
    public int getTempoEntregaEmHoras(){
        return statusPedido.getTempoEntregaEmHoras();
    }
    public void cancelar(){
        if (getStatusPedido().podeMudarParaCancelado()){

            statusPedido = StatusPedido.CANCELADO;
        } else {
            throw new IllegalArgumentException("Pedido nao pode ser cancelado");
        }

    }
}
