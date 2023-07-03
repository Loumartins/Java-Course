package Cap14.interfaces.contasPagar.test;

import Cap14.interfaces.contasPagar.domain.ServicoContaPagar;

public class Principal {
    public static void main(String[] args) {
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        servicoContaPagar.pagar();
    }
}
