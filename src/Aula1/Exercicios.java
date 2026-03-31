package Aula1;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        antecessor e seu sucessor*/

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        /*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();
        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();
        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("A idade expressa em dias é: " + totalDias);
        scanner.close();
    }
}
