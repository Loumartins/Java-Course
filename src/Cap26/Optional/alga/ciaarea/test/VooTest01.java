package Cap26.Optional.alga.ciaarea.test;

import Cap26.Optional.alga.ciaarea.domain.Reserva;
import Cap26.Optional.alga.ciaarea.domain.ServicoDeBagagem;
import Cap26.Optional.alga.ciaarea.domain.ServicoDeReserva;
import Cap26.Optional.alga.ciaarea.domain.Voo;

public class VooTest01 {
    public static void main(String[] args) {
        var servicoReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoReserva.adicionar(new Reserva("28A888", voo , "Joao da Silva"));
        servicoReserva.adicionar(new Reserva("28B111", voo , "Maria da Silva"));
        servicoReserva.adicionar(new Reserva("74F877", voo , "Sebastiao Silveira"));


        servicoDeBagagem.contratar("28A888", 2);

        servicoReserva.getReservas().forEach(System.out::println);

    }
}
