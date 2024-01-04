package Cap26.Optional.alga.ciaarea.test;

import Cap26.Optional.alga.ciaarea.domain.Reserva;
import Cap26.Optional.alga.ciaarea.domain.ServicoDeReserva;
import Cap26.Optional.alga.ciaarea.domain.Voo;

public class VooTest03 {
    public static void main(String[] args) {
        var servicoReserva = new ServicoDeReserva();
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoReserva.adicionar(new Reserva("28A888", voo , "Joao da Silva"));
        servicoReserva.adicionar(new Reserva("28B111", voo , "Maria da Silva"));
        servicoReserva.adicionar(new Reserva("74F877", voo , "Sebastiao Silveira"));

        //utilizando ifPresent => recebe um Consumer
//        servicoReserva.buscar("28A888").ifPresent(reserva -> reserva.adicionarBagagens(10));
//        servicoReserva.getReservas().forEach(System.out::println);


        //utilizando o ifPresentOrElse => recebe um Consumer e um Runnable
        servicoReserva.buscar("28A88").ifPresentOrElse(reserva -> reserva.adicionarBagagens(10),
                () -> System.out.println("Reserva inexistente"));

        servicoReserva.getReservas().forEach(System.out::println);

    }
}
