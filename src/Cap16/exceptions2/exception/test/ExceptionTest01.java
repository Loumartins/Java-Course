package Cap16.exceptions2.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\testee.txt");
        try{
            file.createNewFile();

        } catch (IOException e){
            e.printStackTrace();
        }
;    }
}
