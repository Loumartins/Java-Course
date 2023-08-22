package Cap16.exceptions2.exception.test;

import Cap16.exceptions2.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Luiz";
        String senhaDB = "2040";
        System.out.println("Digite o usuário");
        String usernameUsuario = teclado.nextLine();
        System.out.println("Digite a senha");
        String senhaUsuario = teclado.nextLine();
        if (!usernameDB.equals(usernameUsuario) || !senhaDB.equals(senhaUsuario)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Inicializando login");
     }
}
