package Cap16.exceptions.checadas.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {
        Path arquivo = Path.of("C:\\Users\\luizh\\OneDrive\\Área de Trabalho\\cbas\\criandoArquivo.txt");

        try {
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo"+ e.getMessage());
            e.printStackTrace();
        }

    }
}
