package Cap7.WrapperClasses.wrappersBoxing.aula4;

public class Principal {
    public static void main(String[] args) {
        Integer numero1 = 128;
        Integer numero2 = 128;
        Short numero3 = 128;

        System.out.println(numero1 == numero2);

        //Utilizando o metodo equals para realizar a comparação
        System.out.println(numero1.equals(numero2));
        //equals comparada alem do numero, ele compara tambem o tipo.
        System.out.println(numero1.equals(numero3));
        //comparadando tipos diferentes
        System.out.println(numero1.intValue() == numero3.intValue());
    }
}
