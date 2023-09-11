package Cap17.generic2.Game.domain;

public class ConstruindoObjetosDoJogador <T extends PlayerObject>  {

    T object;

    public ConstruindoObjetosDoJogador(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
