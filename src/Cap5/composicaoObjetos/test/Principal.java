package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.Carro;
import Cap5.composicaoObjetos.domain.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();



        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 120000;



        //---------------------------------------------

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;

        //---------------------------------------------

        System.out.println("Meu carro");
        System.out.println("------------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);

        System.out.println();


        Pessoa eu = new Pessoa();
        Pessoa voce = new Pessoa();

        meuCarro.proprietario = eu;
        seuCarro.proprietario = voce;


        meuCarro.proprietario.nome = "Luiz Henrique";
        seuCarro.proprietario.nome = "Alexandre";

        double calculoValorRevenda = meuCarro.calcularValorRevenda();

        System.out.printf("O tempo de uso em anos do seu carro é de: %d ano(s) %n",meuCarro.calcularTempoDeUsoEmAnos());
        System.out.printf("O valor de revenda do carro: %s é de R$%.2f%n ",meuCarro.modelo,
                calculoValorRevenda);
        System.out.printf("O valor do ipva é de %.2f", meuCarro.calcularIpva());


    }

}
