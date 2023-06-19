package Cap11.encapsulamento.domain;

public class ServicoLocacao {
    public void confirmarLocacao(Locacao locacao){
        double totalDiarias = locacao.getVeiculo().getGrupo().getValorDiaria() *
                locacao.getQuantidadeDiarias();

        locacao.getVeiculo().setDisponivel(false);
    }
}
