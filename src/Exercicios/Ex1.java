package Exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        /*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

        Scanner scanner = new Scanner(System.in);
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
