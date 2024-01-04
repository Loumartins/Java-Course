package Cap26.Optional.alga.ciaarea.test;

import Cap26.Optional.alga.ciaarea.domain.Reserva;
import Cap26.Optional.alga.ciaarea.domain.ServicoDeReserva;
import Cap26.Optional.alga.ciaarea.domain.Voo;

public class VooTest02 {
    public static void main(String[] args) {
        var servicoReserva = new ServicoDeReserva();
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoReserva.adicionar(new Reserva("28A888", voo , "Joao da Silva"));
        servicoReserva.adicionar(new Reserva("28B111", voo , "Maria da Silva"));
        servicoReserva.adicionar(new Reserva("74F877", voo , "Sebastiao Silveira"));

        //utilizando o orElse => retorna um valor padrao  / orElseGet => recebe um supplier
        //Reserva reserva = servicoReserva.buscar("28AXXX").orElse(new Reserva("0000", voo, "passageiro nao informado"));

//        Reserva reserva = servicoReserva.buscar("28AXXX").orElseGet(() -> new Reserva("0000", voo, "passageiro nao informado"));
          Reserva reserva = servicoReserva.buscar("28XXX",
                  () ->new Reserva("0000", voo, "passageiro nao informado"));

        System.out.println(reserva);
    }
}
