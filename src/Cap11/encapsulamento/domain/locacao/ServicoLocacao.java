package Cap11.encapsulamento.domain.locacao;

public class ServicoLocacao {
    public void confirmarLocacao(Locacao locacao){

//        double totalDiarias = locacao.getVeiculo().getGrupo().getValorDiaria() *
//                locacao.getQuantidadeDiarias();

        //refatorando metodo acima com law-of-demeter

        double totalDiarias = locacao.getValorDiaria();

        locacao.getVeiculo().setDisponivel(false);
    }
}
