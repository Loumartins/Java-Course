package Cap26.Optional.ciaarea.domain;

import java.util.Objects;

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

        Reserva reserva = servicoDeReserva.buscar(codigoReserva);

        if (reserva == null) {
            throw new ReservaNaoEncontradaException(String.format("Código de reserva %s nao existe %n", codigoReserva));
        }
        reserva.adicionarBagagens(quantidadeBagagens);

    }
}
