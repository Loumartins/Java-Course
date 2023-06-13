package Cap9.gerenciamentoDeMemoria.main;

public class Teste {
    public static void main(String[] args) {
        imprimirUsoMemoria();


    }
    public static void imprimirUsoMemoria(){
        //Imprimindo memoria maxima disponivel
        System.out.printf("Maxima: %s%n",
                converterEmMegabytes(Runtime.getRuntime().maxMemory()));

        //imprimindo total de memoria empenhada
        System.out.printf("Empenhada: %s%n",
                converterEmMegabytes(Runtime.getRuntime().totalMemory()));

        //imprimindo memoria disponivel
        System.out.printf("Disponivel: %s%n",
                converterEmMegabytes(Runtime.getRuntime().freeMemory()));

        //imprimindo total de memoria utilizada
        long memoriaUsada = Runtime.getRuntime().totalMemory() -
                Runtime.getRuntime().freeMemory();

        System.out.printf("Memoria usada: %s%n", converterEmMegabytes(memoriaUsada));
    }
    public static String converterEmMegabytes(long bytes){
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }
}
