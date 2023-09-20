package Cap19.Enums.test;

import Cap19.Enums.domain.OrigemPedido;
import Cap19.Enums.domain.Pedido;
import Cap19.Enums.domain.StatusPedido;

public class EnumTest01 {
    // O que sao Enums? Sao listas de constantes finitas.
    public static void main(String[] args) {
      Pedido pedido = new Pedido(StatusPedido.EMITIDO, "Luiz Henrique", OrigemPedido.BALCAO );

      pedido.imprimirPedido(pedido);

        System.out.println(pedido.getTempoEntregaEmHoras());


    }
    //Iterando nas constantes

//        for (StatusPedido value : StatusPedido.values()) {
//            System.out.println(value);
//        }


    // Buscando uma String em uma constante dentro de Enum

//        String textoStatus ="CANCELADO";
//        StatusPedido statusPedido = StatusPedido.valueOf(textoStatus);
//        System.out.println(statusPedido.ordinal() + " - " + statusPedido.name());

    // Buscando uma constante pelo seu indice

//        int numero = 1;
//        StatusPedido statusPedido1 = StatusPedido.values()[numero];
//        System.out.println(statusPedido1.ordinal()+ " - " + statusPedido1.name());
}
