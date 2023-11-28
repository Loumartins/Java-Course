package Cap24.ClassesAninhadas.estaticas.domain;

public class ServicoEmail {
 public void enviar(Mensagem mensagem){
     System.out.printf("Enviando de %s para %s: %s%n", mensagem.getRementente(), mensagem.getDestinatario(), mensagem.getTexto());

 }
    private static String gerarAssinatura(){
        return "\n -- \n Luiz Henrique";
    }


    public static class Mensagem {
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
            return texto + gerarAssinatura();
        }
    }

}
