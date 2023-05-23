package Cap7.WrapperClasses.wrappersBoxing.aula5.exercicios.domain;

public class ControleRemoto {
    public Integer canal;
    public Integer volume;

    public void mudarCanal (Integer novoCanal){
        if (canal.equals(novoCanal)){
            System.out.println("Novo canal é tambem o canal atual");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

    public void mudarVolume (Integer novoVolume){
        if (novoVolume.equals(volume)){
            System.out.println("Novo volume tambem é o volume atual");
        } else {
            volume = novoVolume;
            System.out.println("Volume alterado para " + volume);
        }
    }
}
