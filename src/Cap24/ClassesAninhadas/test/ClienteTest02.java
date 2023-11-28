package Cap24.ClassesAninhadas.test;

import Cap24.ClassesAninhadas.domain.Cliente;

public class ClienteTest02 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("joao", 31);
        cliente.setStatus(Cliente.Status.ATIVO);

    }


}
