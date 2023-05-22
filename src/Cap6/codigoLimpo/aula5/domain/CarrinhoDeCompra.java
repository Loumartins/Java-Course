package Cap6.codigoLimpo.aula5.domain;

public class CarrinhoDeCompra {
    public static final double TAXA_SERVICO_PADRAO = 0.10;
    int quantidadeItens;
    Produto produto;

    public double calcularSubtotal() {
        return produto.precoUnitario * this.quantidadeItens;
    }

    public double calcularValorTotal() {
        double subtotal = calcularSubtotal();
        double taxaServico = calcularTaxaServico(subtotal);
        double valorTotal = subtotal + taxaServico;
        return valorTotal;
    }

    public static double calcularTaxaServico(double subtotal) {
        return subtotal * TAXA_SERVICO_PADRAO;
    }

    public static void imprimirRecibo(double valorTotal) {
        System.out.println("Recibo de Pagamento");
        System.out.printf("Valor total: %.2f%n", valorTotal);
    }


    public void realizarCompra (String numeroCartao){
        double valorTotal = calcularValorTotal();

        boolean pagamentoAutorizado = GatewayPagamento.autorizarPagamento(numeroCartao, valorTotal);

        if (pagamentoAutorizado) {
             imprimirRecibo(valorTotal);
        }
    }
}
