package Cap11.encapsulamento.exercicio.test;

import Cap11.encapsulamento.exercicio.domain.ContaPagar;
import Cap11.encapsulamento.exercicio.domain.Fornecedor;

public class ContaPagarTest {
    public static void main(String[] args) {
        var contaDeAgua = new ContaPagar();
        var imobiliaria = new Fornecedor("Imobiliaria do seu zé");

        contaDeAgua.setFornecedor(imobiliaria);
        contaDeAgua.setDataVencimento("23/04/2023");
        contaDeAgua.setValor(45.30);
        contaDeAgua.setDescricao("Conta de agua da imobiliaria do seu zé");
    }
}
