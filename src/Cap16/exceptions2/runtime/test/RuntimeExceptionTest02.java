package Cap16.exceptions2.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        divisao(1, 0);

    }
    public static int divisao(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Argumento ilegal, náo pode ser 0");
        }
            return a/b;

    }
}
