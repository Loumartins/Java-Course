package Cap7.WrapperClasses.wrappersBoxing;

public class Principal2 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.idade = Integer.valueOf(20);

        System.out.printf("Idade: %d%n", cliente.idade);

    }
}