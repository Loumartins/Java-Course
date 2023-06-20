package Cap11.encapsulamento.locacao.domain;

public class ServicoLocacao {
    public void confirmarLocacao(Locacao locacao){

//        double totalDiarias = locacao.getVeiculo().getGrupo().getValorDiaria() *
//                locacao.getQuantidadeDiarias();

        //refatorando metodo acima com law-of-demeter

        //double totalDiarias = locacao.getValorDiarias() * locacao.getQuantidadeDiarias();

        double totalDiarias = locacao.calcularTotalDiarias();

        locacao.reservarVeiculo();
    }
}
