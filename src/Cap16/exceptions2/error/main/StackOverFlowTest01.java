package Cap16.exceptions2.error.main;

public class StackOverFlowTest01 {
    public static void main(String[] args) {

        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
