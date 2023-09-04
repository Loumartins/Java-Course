package Cap17.generic2.test;

import Cap17.generic2.domain.Carro;
import Cap17.generic2.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mes ");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
