package Cap14.interfaces.seguro.test;

import Cap14.interfaces.seguro.dominio.ImovelResidencial;
import Cap14.interfaces.seguro.servicos.ServicoPropostaSeguro;

public class SeguradoraTest1 {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        ImovelResidencial imovelResidencial = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(imovelResidencial);
    }
}
