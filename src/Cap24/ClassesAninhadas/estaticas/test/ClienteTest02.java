package Cap24.ClassesAninhadas.estaticas.test;

import Cap24.ClassesAninhadas.estaticas.domain.Cliente;

public class ClienteTest02 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("joao", 31);
        cliente.setStatus(Cliente.Status.ATIVO);

    }


}
