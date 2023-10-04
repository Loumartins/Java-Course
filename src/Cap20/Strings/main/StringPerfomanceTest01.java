package Cap20.Strings.main;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        //Strings no java sao imutaveis
        String nome = "Luiz"; // String constant pool -> Pool de Strings

        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBufferr " + (fim - inicio) + "ms");
    }


    private static void concatString (int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto+=i;
        }
    }

    private static void concatStringBuilder (int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer (int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
