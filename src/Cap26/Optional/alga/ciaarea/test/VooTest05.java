package Cap26.Optional.alga.ciaarea.test;

import Cap26.Optional.alga.ciaarea.domain.*;

public class VooTest05 {
    public static void main(String[] args) {
        var servicoReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoReserva.adicionar(new Reserva("28A888", voo , "Joao da Silva"));
        servicoReserva.adicionar(new Reserva("28B111", voo , "Maria da Silva"));
        servicoReserva.adicionar(new Reserva("74F877", voo , "Sebastiao Silveira"));

        servicoDeBagagem.contratar("28A888", 1);

        //utilizando o map => "metodo de transformação de valores"

//        Passageiro passageiro = servicoReserva.buscar("28A888")
//                .filter(r -> r.getQuantidadeBagagens() > 0)
//                .map(Reserva::getPassageiro)
//                //nesse momento o map retorna um Optional do tipo Passageiro.
//                .orElseThrow(RuntimeException::new);
//
//        System.out.println(passageiro);

        //utilizando o flatMap ele "desempacota o Optional"

        Passageiro passageiro = servicoReserva.buscar("28A888")
        //Optional<Optional<Passageiro>> = servico.buscar("28A888");
                .filter(r -> r.getQuantidadeBagagens()> 0)
                .flatMap(Reserva::getPassageiro)
                .orElseThrow(RuntimeException::new);


        //o codigo da linha 30 pode ser lido com um Optional de um Optional e caso ainda fosse
        //utilizado o metodo map comum seria necessario mais um orElseThrow. utilizando o flatMap
        //ocorre um desempacotamento da classe Optional, podendo assim usar apenas um orElseThrow

    }
}
