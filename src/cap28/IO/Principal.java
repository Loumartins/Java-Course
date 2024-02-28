package cap28.IO;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        File pasta1 = new File("C:\\Users\\luizh\\IdeaProjects\\Java-Course\\docs");
//  criando pasta utilizando o mkdir()
        pasta1.mkdir();

//  utilizando a criação de arquivos pelo metodo createNewFile();
        File arquivo1 = new File
                ("C:\\Users\\luizh\\IdeaProjects\\Java-Course\\docs\\arquivo.txt");

        arquivo1.createNewFile();
    }
}
