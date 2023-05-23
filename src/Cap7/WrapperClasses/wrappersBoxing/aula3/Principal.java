package Cap7.WrapperClasses.wrappersBoxing.aula3;

public class Principal {
    public static void main(String[] args) {

        //Exemplo de unboxing : Java converte automaticamente um objeto wrapper em seu tipo
        // primitivo correspondente
        Integer diasEntrega = 30;
        int diasEntregaInt = diasEntrega;

        // Exemplo de autoboxing: Java converte automaticamente um tipo primitivo em seu tipo
        // wrapper correspondente
        int number = 34;
        Integer numberInteger = number;
    }
}
