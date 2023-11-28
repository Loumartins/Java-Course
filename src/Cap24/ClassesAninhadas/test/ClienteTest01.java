package Cap24.ClassesAninhadas.test;

import Cap24.ClassesAninhadas.domain.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteTest01 {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Joao", 41));
        clientes.add(new Cliente("Maria", 37));
        clientes.add(new Cliente("Sebastiao", 27));

        Cliente.ordenarPorIdade(clientes);
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
