package Cap24.ClassesAninhadas.domain;

public class Mensagem {
    private final String rementente;
    private final String destinatario;
    private final String texto;

    public Mensagem(String rementente, String destinatario, String texto) {
        this.rementente = rementente;
        this.destinatario = destinatario;
        this.texto = texto;
    }

    public String getRementente() {
        return rementente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getTexto() {
        return texto;
    }
}
