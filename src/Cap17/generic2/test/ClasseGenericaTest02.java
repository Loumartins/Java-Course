package Cap17.generic2.test;

import Cap17.generic2.domain.Barco;
import Cap17.generic2.domain.Carro;
import Cap17.generic2.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<Carro>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<Barco>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mes");
        rentalService.retornarObjetoAlugado(carro);
    }
}
