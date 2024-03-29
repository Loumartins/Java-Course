package Cap25.LambdasExpressions.main;

import Cap25.LambdasExpressions.domain.CadastroCliente;
import Cap25.LambdasExpressions.domain.Cliente;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("Joao", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastiao", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

        //gerando classe anonima
//        Filtro<Cliente> clienteFiltro = new Filtro<Cliente>() {
//            @Override
//            public boolean avaliar(Cliente cliente) {
//                return cliente.getIdade() > 40;
//            }
//        };


        // utilizando lambda expression.
//        Filtro<Cliente> filtro = (Cliente cliente) -> {
//            boolean resultado = cliente.getIdade() > 40;
//            return resultado;
//        };

        //passando o bloco de codigo direto na expressao.
        List<Cliente> clienteConsulta = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);

        //Utilizando Comparator com expressoes lambda
//        List<Cliente> clienteComparator = cadastroCliente.getClientes();
//
//        clienteComparator.sort((cliente1, cliente2) -> Integer.compare(cliente1.getIdade(), cliente2.getIdade()));

        for (Cliente cliente : clienteConsulta) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }



//        for (Cliente cliente : clienteComparator) {
//            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
//        }





//        List<Cliente> clienteList = cadastroCliente.getClientes();
//
//        for (Cliente cliente : clienteList) {
//            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
//
//        }
    }
}
