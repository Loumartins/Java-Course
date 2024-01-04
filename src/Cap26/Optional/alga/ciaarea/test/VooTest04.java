package Cap26.Optional.alga.ciaarea.test;

import Cap26.Optional.alga.ciaarea.domain.*;

import java.util.Optional;

public class VooTest04 {
    public static void main(String[] args) {
        var servicoReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoReserva.adicionar(new Reserva("28A888", voo , "Joao da Silva"));
        servicoReserva.adicionar(new Reserva("28B111", voo , "Maria da Silva"));
        servicoReserva.adicionar(new Reserva("74F877", voo , "Sebastiao Silveira"));


        //utilizando o metodo filter da classe Optional
     //   servicoDeBagagem.contratar("28A888", 1);
        Reserva reserva =  servicoReserva.buscar("28A888")
                .filter(r -> r.getQuantidadeBagagens() > 0)
                .orElseThrow(() -> new ReservaNaoEncontradaException("Reserva inexistente"));

        System.out.println(reserva);
    }
}
