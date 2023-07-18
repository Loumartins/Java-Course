package Cap14.interfaces.seguro.test;

import Cap14.interfaces.seguro.dominio.Caminhao;
import Cap14.interfaces.seguro.dominio.CarroParticular;
import Cap14.interfaces.seguro.dominio.ImovelResidencial;
import Cap14.interfaces.seguro.servicos.ServicoPropostaSeguro;

public class SeguradoraTest1 {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        var carroParticular = new CarroParticular("HR-V", 150_000, 2022);
        var caminhao = new Caminhao("Actros", 780_000, 2021, 4);


        ImovelResidencial imovelResidencial = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(imovelResidencial);
        servicoPropostaSeguro.emitir(carroParticular);
        servicoPropostaSeguro.emitir(caminhao);
    }
}
