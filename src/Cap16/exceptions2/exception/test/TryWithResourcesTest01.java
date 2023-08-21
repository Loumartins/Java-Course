package Cap16.exceptions2.exception.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo() {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        } catch (IOException e){

        }
    }
   /* public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }*/
}
