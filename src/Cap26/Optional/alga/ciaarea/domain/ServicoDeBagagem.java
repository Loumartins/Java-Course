package Cap26.Optional.alga.ciaarea.domain;

import java.util.Objects;
import java.util.Optional;

public class ServicoDeBagagem {

    private ServicoDeReserva servicoDeReserva;

    public ServicoDeBagagem (ServicoDeReserva servicoDeReserva){
        Objects.requireNonNull(servicoDeReserva);
        this.servicoDeReserva = servicoDeReserva;
    }

    public void contratar(String codigoReserva, int quantidadeBagagens){
        if (quantidadeBagagens <= 0){
            throw new IllegalArgumentException("Quantidade de bagagens invalida");
        }

//        Optional<Reserva> reservaOptional = servicoDeReserva.buscar(codigoReserva);
//
//        //verificando se ha valores dentro do optional
////        if (reservaOptional.isPresent()){
////            reservaOptional.get().adicionarBagagens(quantidadeBagagens);
////        } else {
////            throw new ReservaNaoEncontradaException("Reserva não existe");
////        }
////        reservaOptional.ifPresent(reserva -> reserva.adicionarBagagens(quantidadeBagagens));
//
        //utilizando o metodo orElseThrow da classe Optional
        servicoDeReserva.buscar(codigoReserva)
                .orElseThrow(() -> new ReservaNaoEncontradaException("Reserva inexistente"))
                .adicionarBagagens(quantidadeBagagens);
    }
}
