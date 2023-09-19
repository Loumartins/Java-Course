package Cap18.Collections.encapsulandoColecoes.main;

import Cap18.Collections.encapsulandoColecoes.domain.Cliente;
import Cap18.Collections.encapsulandoColecoes.domain.ItemVenda;
import Cap18.Collections.encapsulandoColecoes.domain.Venda;

public class VendaTest01 {
    public static void main(String[] args) {
        ItemVenda mouse = new ItemVenda("Magic Mouse", 700);
        ItemVenda adaptadorUsb = new ItemVenda("Adaptador USB", 400);
        ItemVenda macboook = new ItemVenda("Macbook Pro", 15_000);
        ItemVenda limpaTela = new ItemVenda("Limpa Tela", 70);

        Cliente cliente = new Cliente("Joao da Silva", 2_000);
        Venda venda = new Venda(cliente);

        venda.adicionarItem(mouse);
        venda.adicionarItem(adaptadorUsb);
     //   venda.adicionarItem(macboook);

        System.out.println(venda.getValor());

    }
}