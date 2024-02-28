package cap28.IO;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {

        //renomendo pasta
//        File file1 = new File("docs");
        File file2 = new File("documentos");
//        System.out.println(file1.renameTo(file2));

        //excluindo pasta

        File arquivo1 = new File(file2, "arquivo.txt");

        arquivo1.delete();


        file2.delete();


    }
}
