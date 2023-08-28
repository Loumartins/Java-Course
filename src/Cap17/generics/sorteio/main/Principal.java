package Cap17.generics.sorteio.main;

import Cap17.generics.sorteio.domain.Cliente;
import Cap17.generics.sorteio.domain.Sorteador;

public class Principal {
    public static void main(String[] args) {
        Cliente [] clientes = {
            new Cliente("Supermercado Pague e Leve", 2_000_000),
            new Cliente("Posto Gasolina Boa", 800_000),
            new Cliente("Javac Consultoria", 58_000_000)
        };

        Cliente clienteSorteado = Sorteador.sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }
}
