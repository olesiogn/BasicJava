package Aula2.exercicios;

import java.util.Scanner;

public class Ex2_ValidacaoLogin {
    public static void main(String[] args) {

        /*
        Validação de Login

        Crie um programa que simule um login. O programa deve:
        Ler um nome de usuário e uma senha
        Verificar se o usuário é "admin" E a senha é "1234"
        Se ambos estiverem corretos, exiba "Login realizado!"
        Caso contrário, exiba "Usuário ou senha incorretos"
        Entrada: Usuário e senha Saída: Mensagem de sucesso ou erro
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Login realizado!");
        } else {
            System.out.println("Usuário ou senha incorretos");
        }

        scanner.close();
    }
}
