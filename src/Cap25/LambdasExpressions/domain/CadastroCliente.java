package Cap25.LambdasExpressions.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class  CadastroCliente {

    private final List<Cliente> clientes = new ArrayList<>();


    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionar(Cliente cliente){
        clientes.add(cliente);
    }

    //implementando uma interface funcional do pacote java.util.function
    public List<Cliente> consultar(Predicate<Cliente> filtro){
        List<Cliente> clientesFiltrados = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (filtro.test(cliente)){
                clientesFiltrados.add(cliente);
            }
        }
        return clientesFiltrados;
    }
}
